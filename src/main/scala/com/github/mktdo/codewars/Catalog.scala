package com.github.mktdo.codewars

// https://www.codewars.com/kata/catalog/train/scala

object Catalog {
  sealed class Parse
  case class Product(name: String, prx: String, qty: String) extends Parse
  case object NotParsed extends Parse
  def catalog(s: String, article: String): String = {
    val r = """<prod><name>([a-z|A-Z|\s]+)</name><prx>((?:[1-9]\d*|0)(?:\.\d+)?)</prx><qty>(\d+)</qty></prod>""".r
    val products = s.split("\\n").collect {
      str => str match {
        case r(name, prx, qty) => Product(name, prx, qty)
        case _ => NotParsed
      }
    }.filter(_ match {
      case Product(_, _, _) => true
      case NotParsed => false
    })
    val res = products.collect { case Product(name, prx, qty) if name.contains(article) => s"$name > prx: $$$prx qty: $qty" }
    if (res.size == 0) "Nothing" else res.mkString("\n")
  }
}
