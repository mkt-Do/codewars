package com.github.mktdo.codewars

object CountSmileyFace {
  def countSmileys(vec: Vector[String]): Int = {
    vec.count(face => {
      val (eyes, nose, mouth) = (face.head, if (face.length == 2) "" else face(1), face.last)
      val isEyes = eyes == ':' || eyes == ';'
      val isNose = if (nose == "") true else nose == '-' || nose == '~'
      val isMouth = mouth == ')' || mouth == 'D'
      isEyes && isNose && isMouth
    })
  }
}
