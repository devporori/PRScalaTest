package com.Dev_porori.Scalatest

object Number1 {
  def main(args: Array[String]): Unit = {
    val num = -3;
    val numAbs = num.abs // ����
    val max = numAbs.max(9) // 3~9���� �ִ밪
    val min = numAbs.min(9) // 3~9���� �ּҰ�
    println(numAbs)
    println(max)
    println(min)
  }
}