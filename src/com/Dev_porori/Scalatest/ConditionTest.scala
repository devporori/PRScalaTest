package com.Dev_porori.Scalatest

object ConditionTest {
  def main(args: Array[String]): Unit = {
    if (true)
      println("������ ��ȣ ����.")

    if (1 + 2 == 3) {
      println("�������� ��ȣ�ʿ�.")
      println("[ '{', '}' ]")
    } else
      println("�� ���Ǵ�θ� ���� �ȳ��Ϳ�.")

  }
}