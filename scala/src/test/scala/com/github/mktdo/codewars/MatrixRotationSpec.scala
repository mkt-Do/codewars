package com.github.mktdo.codewars

import org.scalatest.FunSuite

class MatrixRotationSpec extends FunSuite {

  test("Samples") {
    assert(MatrixRotation.rotateClockwise(Array()) === Array())
    assert(MatrixRotation.rotateClockwise(Array("abc")) === Array("a", "b", "c"))
    assert(MatrixRotation.rotateClockwise(Array("cba")) === Array("c", "b", "a"))
    assert(MatrixRotation.rotateClockwise(Array("c", "b", "a")) === Array("abc"))
    assert(
      MatrixRotation.rotateClockwise(Array(
        "abc",
        "def"
      ))
      ===
      Array(
        "da",
        "eb",
        "fc"
      )
    )
    assert(MatrixRotation.rotateClockwise(Array("")) === Array())
    assert(MatrixRotation.rotateClockwise(Array("", "", "")) === Array())
    assert(
      MatrixRotation.rotateClockwise(Array(
        "###.....",
        "..###...",
        "....###.",
        ".....###",
        ".....###",
        "....###.",
        "..###...",
        "###....."
      ))
      ===
      Array(
        "#......#",
        "#......#",
        "##....##",
        ".#....#.",
        ".##..##.",
        "..####..",
        "..####..",
        "...##..."
      )
    )
  }
}
