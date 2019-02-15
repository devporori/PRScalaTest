package com.Dev_porori.Scalatest

object Test1 {
  def main(args: Array[String]): Unit = {
    var x = 100
    var y = 15
    
    // 1. println
    println("1. " + x + "는 " + y + "보다 크다.")
    
    // 2. 문자열에서 앞에 s를 쓰면 $기호와 함께 변수를 쓸수있음.
    println(s"2. $x 는 $y 보다 크다.")
    
    // 3. 수식은 ${ } 사이에 넣으면 됨.
    println(s"3. x + y : ${ x + y }")
    
    // 4. printf도 가능
    // Java.lang.* 은 자동 import
    printf("4. 원주율은 %f 이다.", Math.PI)
  }
}