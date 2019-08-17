package com.scalademo.basic

object FunctionCombinator {
  
  def main(args: Array[String]) {
    
    val o = List(1, 2, 3, 4)
    val oo = List(5, 6, 7, 8)
    val ooo = List(o, oo)
    
    println(o)
    
    val n = o.map(i => i * 10)
    println(n)
    
    o.foreach(i => i * 20)
    
    val n2 = o.filter(i => i >= 3).map(i => i * 2)
    println(n2)
    
    val n3 = o.foldLeft(0)( (i, j) => i + j )
    println(n3)
    
    val n4 = o.partition(i => i % 2 == 0)
    println(n4)
    
    val n5 = o zip oo
    println(n5)
    println(n5.unzip)
    
    val n6 = o.find( i => i >= 2 ) // find first element
    println(n6)
    
    val n7 = o.drop(2) // remove 0 ~ 2 elements
    println(n7)
    
    val n8 = o.dropWhile( i => i < 3 ) // remove element if condition true
    println(n8)
    
    val n9 = ooo.flatten
    println(n9)
    
  }
}


