package com.Dev_porori.Scalatest

object LoopTest2 {

  def main(args: Array[String]): Unit = {
    for (a <- 1 to 3) {
      for (b <- 4 to 6) {
        println("1 - " + a, b)
      }
    }

    for (c <- 1 to 3; d <- 4 to 6) {
      println("2 - " + c, d)
    }
  }

}