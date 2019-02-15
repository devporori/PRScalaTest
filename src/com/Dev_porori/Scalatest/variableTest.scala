package com.Dev_porori.Scalatest

object variableTest {
  def main(args: Array[String]): Unit = {
    // 변수 = var
    // 상수 = val
    // 여러 개의 변수를 선언, 대입가능

    var x = 1 + 2
    x = 3 * 4
    println(x)

    val y = 1 + 2
    // y = 3 * 4 - 상수에 값을 대입해서 오류남
    println(y)

    var a, b, c = 5 // 여러개의 변수 선언, 값대입
    println(a)
    println(b)
    println(c)
  }
}