package com.scalademo.basic

import java.util.Date

object Ex05Function {

  def main(args: Array[String]): Unit = {
    println("Returned Value : " + addInt(10, 20))
    //////////
    delayed(time())
    //////////////
    printInt(b = 20, a = 100)
    ///////////////
    printStrings("a", "b", "c", "d")
    ////////////////
    println("Returned Value 2 : " + addInt2())
    /////////////////
    println(apply(layout, 10))
    /////////////////
    println(factorial(0))
    println(factorial(1))
    println(factorial(2))
    println(factorial(3))

    /////////////////////

    println(mul(3, 4))
    println(userDir())

    ////////////////

    val logWithDateBound = log(new Date, _: String)
    logWithDateBound("message1")
    logWithDateBound("message2")
    logWithDateBound("message3")
    
    //////////////////
    
    val str1:String = "Hello, " 
    val str2:String = "Scala!" 
    println( "str1 + str2 = " + strcat(str1)(str2) )
  }

  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b
    return sum
  }

  /////////////////////

  def time() = {
    println("Getting time in nano seconds")
    System.nanoTime
  }
  def delayed(t: => Long) = {
    println("In delayed method")
    println("Param: " + t)
    t
  }

  ////////////////////////////

  def printInt(a: Int, b: Int) = {
    println("Value of a : " + a);
    println("Value of b : " + b);
  }

  ////////////////////////////

  def printStrings(args: String*) = {
    var i: Int = 0;
    for (arg <- args) {
      println("Arg value[" + i + "] = " + arg);
      i = i + 1;
    }
  }

  /////////////////////////////

  def addInt2(a: Int = 5, b: Int = 7): Int = {
    var sum: Int = 0
    sum = a + b
    sum
  }

  ////////////////////////////////

  def apply(f: Int => String, v: Int) = f(v)
  def layout[A](x: A) = "[" + x.toString() + "]"

  /////////////////////////////////

  def factorial(i: Int): Int = {
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }
    fact(i, 1)
  }

  //////////////////////////////

  var mul = (x: Int, y: Int) => x * y
  var userDir = () => { System.getProperty("user.dir") }

  ////////////////////////////

  def log(date: Date, message: String) = {
    println(date + "----" + message)
  }

  def strcat(s1: String)(s2: String) = {
    s1 + s2
  }

}