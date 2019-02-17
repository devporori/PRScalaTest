package com.Dev_porori.Scalatest

object Test2 {
  def main(args: Array[String]): Unit = {
    // 뒤집기
    val rev = "Scala".reverse
    println(s"Scala > $rev") // Scala > alacS
    
    // 첫글짜 대문자
    val cap = "scala".capitalize
    println(s"scale > $cap") // scale > Scala
    
    // 반복
    val mul = "Scala" * 5
    println(s"Scala > $mul") // Scala > ScalaScalaScalaScalaScala
    
    // 정수로 바꾸기
    val int = "123".toInt
    println(s"(String) 123 > (int) $int") // (String) 123 > (int) 123
    
  }
}