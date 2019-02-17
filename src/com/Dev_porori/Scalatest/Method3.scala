package com.Dev_porori.Scalatest

object Method3 {

  // �Ϲ� �޼ҵ� ���
  def add1(a: Int, b: Int) = a + b

  // �͸��Լ�
  val add2 = (a: Int, b: Int) => a + b

  val add3: (Int, Int) => Int = _ + _
  
  // �߻�����
  val add4 = (_ + _):(Int, Int) => Int
  
  def main(args: Array[String]): Unit = {
    println(s"${add1(1,2)}")
    println(s"${add2(1,2)}")
    println(s"${add3(1,2)}")
    println(s"${add4(1,2)}")
  }
}