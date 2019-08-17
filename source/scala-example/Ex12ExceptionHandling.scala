package com.scalademo.basic

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
import util.control.Breaks._

object Ex12ExceptionHandling {
  def main(args: Array[String]) = {
    try {
      val f = new FileReader("input2.txt")
      breakable {
        while(true) {                
          val i = f.read()
          if ( i == -1) break
          val c: Char = i.asInstanceOf[Char]
          print(c)
        }
      }
      println()
    } catch {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    } finally {
      println("Exiting finally...")
    }
  }
}