package com.github.mktdo.codewars

// https://www.codewars.com/kata/ease-the-stockbroker/train/scala

object EaseTheStockBroker {
  def balanceStatements(lst: String): String = {
    class Orders
    case class Order(quote: String, quantity: Int, price: Double, status: String) extends Orders
    case class BadlyOrder(order: String) extends Orders
    case object EmptyOrder extends Orders
    def convertOrder(str: String): Orders = {
      val splitStr = str.split(" ")
      if (splitStr.size == 4 && splitStr(1).matches("""\d+""") && splitStr(2).matches("""\d+\.\d+""") && splitStr(3).matches("""[B|S]"""))
        Order(splitStr(0), splitStr(1).toInt, splitStr(2).toDouble, splitStr(3))
      else if (str.isEmpty) EmptyOrder
      else BadlyOrder(str)
    }
    val orders = lst.split(", ").map(convertOrder)
    val (correctOrders, badlyOrders) = orders.partition { _ match {
      case Order(_, _, _, _) => true
      case _ => false
    }}
    val (buy, sell) = correctOrders.foldLeft((0.0, 0.0)) { case ((bp, sp), Order(_, q, p, s)) =>
      s match {
        case "B" => (bp + q * p, sp)
        case "S" => (bp, sp + q * p)
        case _ => (bp, sp)
      }
    }
    val badlyCnt = badlyOrders.size
    val badlyStr = if (badlyCnt == 0 || (badlyCnt == 1 && badlyOrders.head == EmptyOrder)) ""
      else s"; Badly formed ${ badlyCnt }: ${ badlyOrders.map { case BadlyOrder(order) => order }.mkString(" ;") } ;"
    s"Buy: ${ BigDecimal(buy).setScale(0, BigDecimal.RoundingMode.HALF_UP) } Sell: ${ BigDecimal(sell).setScale(0, BigDecimal.RoundingMode.HALF_UP) }${ badlyStr }"
  }
}
