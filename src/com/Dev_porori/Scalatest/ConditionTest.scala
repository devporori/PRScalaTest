package com.Dev_porori.Scalatest

object ConditionTest {
  def main(args: Array[String]): Unit = {
    if (true)
      println("한줄은 괄호 생략.")

    if (1 + 2 == 3) {
      println("여러줄은 괄호필요.")
      println("[ '{', '}' ]")
    } else
      println("위 조건대로면 절대 안나와요.")

  }
}