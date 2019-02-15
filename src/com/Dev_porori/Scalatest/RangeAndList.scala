package com.Dev_porori.Scalatest

object RangeAndList {
  def main(args: Array[String]): Unit = {
    // to�� ���� 1���� 10�� �����ϴ� range�� ����
    val r1 = 1 to 10
    println(s"1 to 10 :\n\t $r1")
    
    // until�� �̿��ϸ� ������ ���ڸ� ���Ծ��ϴ� range�� ����
    val r2 = 1 until 10
    println(s"1 until 10 :\n\t $r2")
    
    // by�� ���� ���ڸ� �ǳʶ�� range�� ����
    val r3 = 1 until 10 by 5
    println(s"1 until 10 by 5 :\n\t $r3")
    
    // toList�� �Ἥ list�� �ٲ�
    println(s"r1.toList :\n\t ${r1.toList}")
    
    // filter : ���ǿ� �´°͸� ����
    val moreThan7 = r1.filter(_ > 7)
    println(s"r1.filter(_ > 7) :\n\t $moreThan7")
    
    // map : �� �������� �� ����
    val plus1 = r1.map(_ + 1)
    println(s"r1.map(_ + 1) :\n\t $plus1")
  }
}