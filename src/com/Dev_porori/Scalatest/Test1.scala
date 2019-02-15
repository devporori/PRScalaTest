package com.Dev_porori.Scalatest

object Test1 {
  def main(args: Array[String]): Unit = {
    var x = 100
    var y = 15
    
    // 1. println
    println("1. " + x + "�� " + y + "���� ũ��.")
    
    // 2. ���ڿ����� �տ� s�� ���� $��ȣ�� �Բ� ������ ��������.
    println(s"2. $x �� $y ���� ũ��.")
    
    // 3. ������ ${ } ���̿� ������ ��.
    println(s"3. x + y : ${ x + y }")
    
    // 4. printf�� ����
    // Java.lang.* �� �ڵ� import
    printf("4. �������� %f �̴�.", Math.PI)
  }
}