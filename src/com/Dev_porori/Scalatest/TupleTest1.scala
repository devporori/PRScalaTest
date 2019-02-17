package com.Dev_porori.Scalatest

object TupleTest1 {
  
  def main(args: Array[String]): Unit = {
    val tu1 = new Tuple1(1, "Tuple", false)
    val tu2 = (1, "Tuple", false)
    
    println(tu2)
    
    var nums = (1, 2, 3, 4, 5)
    val sum = nums._1 + nums._2 + nums._3 + nums._4 + nums._5
    println(sum)
  }
  
}