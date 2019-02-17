package com.Dev_porori.Scalatest

object Method2 {
  
  def squareOf(f: (Int, Int) => Int) = f(1, 2)
  
  def main(args: Array[String]): Unit = {
    val c1 = squareOf((a: Int, b: Int) => a + b)
    val c2 = squareOf((a, b) => a + b)
    val c3 = squareOf(_ + _)
    
    println(s"$c1 / $c2 / $c3")
  }
  
}