package com.Dev_porori.Scalatest

object Method1 {

  // 일반 메소드
  def add(num1: Int, num2: Int): Int = {
    return num1 + num2;
  }

  // 반환하지 않는 메소드
  def add2(num1: Int, num2: Int) = {
    num1 + num2 // 반환하는 구문이 없어도 마지막값을 반환함.
  }

  // 메소드가 한줄이면 중괄호 " { } " 생략
  def add3(num1: Int, num2: Int) = num1 + num2

  def main(args: Array[String]): Unit = {
    println(s"${add(1,1)}")
    println(s"${add2(1,1)}")
    println(s"${add3(1,1)}")
  }
  
}