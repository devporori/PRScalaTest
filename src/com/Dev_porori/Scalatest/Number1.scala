package com.Dev_porori.Scalatest

object Number1 {
  def main(args: Array[String]): Unit = {
    val num = -3;
    val numAbs = num.abs // 절댓값
    val max = numAbs.max(9) // 3~9사이 최대값
    val min = numAbs.min(9) // 3~9사이 최소값
    println(numAbs)
    println(max)
    println(min)
  }
}