package com.Dev_porori.Scalatest

object Method1 {

  // �Ϲ� �޼ҵ�
  def add(num1: Int, num2: Int): Int = {
    return num1 + num2;
  }

  // ��ȯ���� �ʴ� �޼ҵ�
  def add2(num1: Int, num2: Int) = {
    num1 + num2 // ��ȯ�ϴ� ������ ��� ���������� ��ȯ��.
  }

  // �޼ҵ尡 �����̸� �߰�ȣ " { } " ����
  def add3(num1: Int, num2: Int) = num1 + num2

  def main(args: Array[String]): Unit = {
    println(s"${add(1,1)}")
    println(s"${add2(1,1)}")
    println(s"${add3(1,1)}")
  }
  
}