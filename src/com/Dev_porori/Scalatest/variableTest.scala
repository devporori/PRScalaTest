package com.Dev_porori.Scalatest

object variableTest {
  def main(args: Array[String]): Unit = {
    // ���� = var
    // ��� = val
    // ���� ���� ������ ����, ���԰���

    var x = 1 + 2
    x = 3 * 4
    println(x)

    val y = 1 + 2
    // y = 3 * 4 - ����� ���� �����ؼ� ������
    println(y)

    var a, b, c = 5 // �������� ���� ����, ������
    println(a)
    println(b)
    println(c)
  }
}