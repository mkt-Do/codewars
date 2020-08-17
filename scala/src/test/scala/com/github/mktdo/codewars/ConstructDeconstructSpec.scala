package com.github.mktdo.codewars

import org.scalatest.FunSuite
import com.github.mktdo.codewars.ConstructDeconstruct._

class ConstructDeconstructSpec extends FunSuite {

  test("Provide an alternative constructor") {
    assert(Person("James", "Smith", 27, Male) === Person("James Smith", 27, Male))
  }

  test("Make a constructor field optional with a default value") {
    // It should be possible to optionally provide a midddle name:
    Person("John Kennedy", 27, Male, Some("Fitzgerald"))
    // Or not to provide it:
    assert(Person("John Kennedy", 27, Male, None) === Person("John Kennedy", 27, Male))
  }
  
  test("Pattern match Gender") {

    def gender(str: String): Option[Gender] =
      str match {
        case Extractor(gender) => Some(gender)
        case _                 => None
      }

    assert(gender("M") === Some(Male))
    assert(gender("F") === Some(Female))
    assert(gender("T") === None)
  }

  test("Pattern match from a String") {

    def extractAge(str: String): Option[Int] =
      str match {
        case Person(_, age, _) if age % 10 == 0 => Some(age+5)
        case Person(_, age, Female)             => Some(age-10)
        case Person(_, age, _)                  => Some(age)
        case _                                  => None
      }

    assert(extractAge("James Johnson-30-M") === Some(35))
    assert(extractAge("Maria Rodriguez-46-F") === Some(36))
    assert(extractAge("James-Johnson-34-M") === Some(34))
    assert(extractAge("Maria Rodriguez-lO-F") === None)
    assert(extractAge("Maria-Ro-driguez-46-F") === None)
    assert(extractAge("Maria Rodriguez-46-T") === None)
  }
}
