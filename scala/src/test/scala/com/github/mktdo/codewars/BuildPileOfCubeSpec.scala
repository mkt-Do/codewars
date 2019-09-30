package com.github.mktdo.codewars

import org.scalatest.FunSuite

class BuildPileOfCubeSpec extends FunSuite {

  test("Samples") {
    assert(BuildPileOfCube.findNb(4183059834009L)   === 2022)
    assert(BuildPileOfCube.findNb(24723578342962L)  === -1)
    assert(BuildPileOfCube.findNb(135440716410000L) === 4824)
    assert(BuildPileOfCube.findNb(40539911473216L)  === 3568)
    assert(BuildPileOfCube.findNb(26825883955641L)  === 3218)
  }
}
