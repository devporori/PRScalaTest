package com.Dev_porori.Scalatest

object Method3 {

  // 일반 메소드 방식
  def add1(a: Int, b: Int) = a + b

  // 익명함수
  val add2 = (a: Int, b: Int) => a + b

  val add3: (Int, Int) => Int = _ + _
  
  // 잘사용안함
  val add4 = (_ + _):(Int, Int) => Int
  
  def main(args: Array[String]): Unit = {
    println(s"${add1(1,2)}")
    println(s"${add2(1,2)}")
    println(s"${add3(1,2)}")
    println(s"${add4(1,2)}")
  }
}