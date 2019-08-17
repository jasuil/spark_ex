package com.scalademo.basic

import scala.util.control._

object Ex4ControlStatement {
  def main(args: Array[String]) {

    var x = 30;
    if (x == 10) {
      println("Value of X is 10");
    } else if (x == 20) {
      println("Value of X is 20");
    } else if (x == 30) {
      println("Value of X is 30");
    } else {
      println("This is else statement");
    }

    ///////////////////////////////////

    x = 30;
    var y = 10;
    if (x == 30) {
      if (y == 10) {
        println("X = 30 and Y = 10");
      }
    }

    ////////////////////////////////////////////

    var a = 10;

    while (a < 20) {
      println("Value of a: " + a);
      a = a + 1;
    }

    /////////////////////////////////////////////

    do {
      println("Value of a: " + a);
      a = a + 1;
    } while (a < 20)

    ////////////////////////////////////////////////

    for (a <- 1 to 10) {
      println("Value of a: " + a);
    }

    for (a <- 1 until 10) {
      println("Value of a: " + a);
    }

    for (a <- 1 to 3; b <- 1 to 3) {
      println("Value of a: " + a);
      println("Value of b: " + b);
    }

    val numList = List(1, 2, 3, 4, 5, 6);
    for (a <- numList) {
      println("Value of a: " + a);
    }

    val numList2 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    for (a <- numList2 if a != 3; if a < 8) {
      println("Value of a: " + a);
    }

    ///////////////////////////

    val loop = new Breaks;
    loop.breakable {
      for (a <- numList) {
        println("Value of a: " + a);
        if (a == 4) {
          loop.break;
        }
      }
    }
    println("After the loop");

    var a2 = 0;
    var b2 = 0;
    val numList3 = List(1, 2, 3, 4, 5);
    val numList4 = List(11, 12, 13);
    val outer = new Breaks;
    val inner = new Breaks;
    outer.breakable {
      for (a2 <- numList3) {
        println("Value of a2: " + a2);
        inner.breakable {
          for (b2 <- numList4) {
            println("Value of b2: " + b2);
            if (b2 == 12) { 
              inner.break; 
            }
          }
        } // inner breakable 
      }
    }// outer breakable.

  }
}