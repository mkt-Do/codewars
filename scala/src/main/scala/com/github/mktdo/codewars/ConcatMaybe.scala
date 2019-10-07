package com.github.mktdo.codewars

object ConcatMaybe {
  def concatOption(first: Option[String], second: Option[String]): Option[String] = first match {
    case Some(fst) => second match {
      case Some(snd) => Option(s"$fst $snd")
      case None => None
    }
    case None => None
  }
}
