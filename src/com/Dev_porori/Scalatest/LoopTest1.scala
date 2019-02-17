package com.Dev_porori.Scalatest

object LoopTest1 {
  
  def main(args: Array[String]): Unit = {
    // while
    var i, sum = 0
    while ( i < 10 ) {
      sum += i
      i += 1
    }
    println(sum)
    
    // for
    for ( i <- 0 until 10) {
      sum += i
    }
    println(sum)
    
    sum = (0 until 10).sum
    println(sum)
  }
  
}