package com.Dev_porori.Scalatest

object Test2 {
  def main(args: Array[String]): Unit = {
    // ������
    val rev = "Scala".reverse
    println(s"Scala > $rev") // Scala > alacS
    
    // ù��¥ �빮��
    val cap = "scala".capitalize
    println(s"scale > $cap") // scale > Scala
    
    // �ݺ�
    val mul = "Scala" * 5
    println(s"Scala > $mul") // Scala > ScalaScalaScalaScalaScala
    
    // ������ �ٲٱ�
    val int = "123".toInt
    println(s"(String) 123 > (int) $int") // (String) 123 > (int) 123
    
  }
}