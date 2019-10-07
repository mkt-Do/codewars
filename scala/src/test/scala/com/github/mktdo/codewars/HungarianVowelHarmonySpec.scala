package com.github.mktdo.codewars

import org.scalatest.FlatSpec

class HungarianVowelHarmonySpec extends FlatSpec {
  it should "work with example tests" in {
    assert(HungarianVowelHarmony.dative("ablak") == "ablaknak")
    assert(HungarianVowelHarmony.dative("tükör") == "tükörnek")
    assert(HungarianVowelHarmony.dative("keret") == "keretnek")
    assert(HungarianVowelHarmony.dative("otthon") == "otthonnak")
    assert(HungarianVowelHarmony.dative("virág") == "virágnak")
    assert(HungarianVowelHarmony.dative("tett") == "tettnek")
    assert(HungarianVowelHarmony.dative("rokkant") == "rokkantnak")
    assert(HungarianVowelHarmony.dative("rossz") == "rossznak")
    assert(HungarianVowelHarmony.dative("gonosz") == "gonosznak")
  }
}
