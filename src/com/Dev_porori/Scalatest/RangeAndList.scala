package com.Dev_porori.Scalatest

object RangeAndList {
  def main(args: Array[String]): Unit = {
    // to를 쓰면 1부터 10을 포함하는 range를 만듬
    val r1 = 1 to 10
    println(s"1 to 10 :\n\t $r1")
    
    // until을 이용하면 마지막 숫자를 포함안하는 range를 만듬
    val r2 = 1 until 10
    println(s"1 until 10 :\n\t $r2")
    
    // by를 쓰면 숫자를 건너띄는 range를 만듬
    val r3 = 1 until 10 by 5
    println(s"1 until 10 by 5 :\n\t $r3")
    
    // toList를 써서 list로 바꿈
    println(s"r1.toList :\n\t ${r1.toList}")
    
    // filter : 조건에 맞는것만 모음
    val moreThan7 = r1.filter(_ > 7)
    println(s"r1.filter(_ > 7) :\n\t $moreThan7")
    
    // map : 각 아이템의 값 변경
    val plus1 = r1.map(_ + 1)
    println(s"r1.map(_ + 1) :\n\t $plus1")
  }
}