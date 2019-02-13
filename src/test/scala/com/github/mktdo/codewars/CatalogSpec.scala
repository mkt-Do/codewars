package com.github.mktdo.codewars

import java.util.Random
import org.scalatest._
import org.scalatest.Assertions._

import CatalogTest._

class CatalogTest extends FlatSpec {
  it should "pass basic tests" in {
    testing(s, "ladder" , "ladder > prx: $112 qty: 12");
    testing(s, "saw" , "table saw > prx: $1099.99 qty: 5\nsaw > prx: $9 qty: 10\nsaw for metal > prx: $13.80 qty: 32");

  }
}

object CatalogTest {
  var s =
    "<prod><name>drill</name><prx>99</prx><qty>5</qty></prod>\n\n" +
    "<prod><name>hammer</name><prx>10</prx><qty>50</qty></prod>\n\n" +
    "<prod><name>screwdriver</name><prx>5</prx><qty>51</qty></prod>\n\n" +
    "<prod><name>table saw</name><prx>1099.99</prx><qty>5</qty></prod>\n\n" +
    "<prod><name>saw</name><prx>9</prx><qty>10</qty></prod>\n\n" +
    "<prod><name>chair</name><prx>100</prx><qty>20</qty></prod>\n\n" +
    "<prod><name>fan</name><prx>50</prx><qty>8</qty></prod>\n\n" +
    "<prod><name>wire</name><prx>10.8</prx><qty>15</qty></prod>\n\n" +
    "<prod><name>battery</name><prx>150</prx><qty>12</qty></prod>\n\n" +
    "<prod><name>pallet</name><prx>10</prx><qty>50</qty></prod>\n\n" +
    "<prod><name>wheel</name><prx>8.80</prx><qty>32</qty></prod>\n\n" +
    "<prod><name>extractor</name><prx>105</prx><qty>17</qty></prod>\n\n" +
    "<prod><name>bumper</name><prx>150</prx><qty>3</qty></prod>\n\n" +
    "<prod><name>ladder</name><prx>112</prx><qty>12</qty></prod>\n\n" +
    "<prod><name>hoist</name><prx>13.80</prx><qty>32</qty></prod>\n\n" +
    "<prod><name>platform</name><prx>65</prx><qty>21</qty></prod>\n\n" +
    "<prod><name>car wheel</name><prx>505</prx><qty>7</qty></prod>\n\n" +
    "<prod><name>bicycle wheel</name><prx>150</prx><qty>11</qty></prod>\n\n" +
    "<prod><name>big hammer</name><prx>18</prx><qty>12</qty></prod>\n\n" +
    "<prod><name>saw for metal</name><prx>13.80</prx><qty>32</qty></prod>\n\n" +
    "<prod><name>wood pallet</name><prx>65</prx><qty>21</qty></prod>\n\n" +
    "<prod><name>circular fan</name><prx>80</prx><qty>8</qty></prod>\n\n" +
    "<prod><name>exhaust fan</name><prx>62</prx><qty>8</qty></prod>\n\n" +
    "<prod><name>cattle prod</name><prx>990</prx><qty>2</qty></prod>\n\n" +
    "<prod><name>window fan</name><prx>62</prx><qty>8</qty></prod>"

  private def testing(s: String, art: String, expect: String): Unit = {
    println("Testing with article: " + art)
    val actual: String = Catalog.catalog(s, art)
    println("Actual: " + actual)
    println("Expect: " + expect)
    println("#")
    assertResult(expect){actual}
  }
}
