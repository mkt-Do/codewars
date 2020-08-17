package com.github.mktdo.codewars

object ConstructDeconstruct {
  import scala.util.matching.Regex
  case class Person(name: String, age: Int, gender: Gender)
  object Person {
    def apply(firstName: String,
              lastName: String,
              age: Int,
              gender: Gender): Person = Person(s"${firstName} ${lastName}", age, gender)
    def apply(name: String,
              age: Int,
              gender: Gender,
              middleName: Option[String] = None): Person = Person(name, age, gender)
    def unapply(str: String): Option[(String, Int, Gender)] = {
      val defreg: Regex = "([a-z|A-Z|\\s]+)-([\\d]+)-([M|F])".r
      val sepreg: Regex = "([a-z|A-Z|\\s]+)-([a-z|A-Z|\\s]+)-([\\d]+)-([M|F])".r
      str match {
        case defreg(name, age, gender) => Some((name, age.toInt, if (gender == "M") Male else Female))
        case sepreg(firstName, lastName, age, gender) => Some((s"${firstName} ${lastName}", age.toInt, if (gender == "M") Male else Female))
        case _ => None
      }
    }
  }

  sealed trait Gender
  case object Male extends Gender
  case object Female extends Gender

  object Extractor {
    def unapply(str: String): Option[Gender] = str match {
      case "F" => Some(Female)
      case "M" => Some(Male)
      case _ => None
    }
  }
}
