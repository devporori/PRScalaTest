package com.Dev_porori.Scalatest

object Test3 {
  
  def s(a: String, b: String) = (b, a)
  
  def main(args: Array[String]): Unit = {
    val (a, b) = s("여러값", "반환")
    println(a, b)
  }
  
}