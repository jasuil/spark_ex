package com.scalademo.basic


object Ex9Array {
  def main(args: Array[String]) = {
    var myList = Array(1.9, 2.9, 3.4, 3.5)

    // Print all the array elements
    for (x <- myList) {
      println(x)
    }

    // Summing all elements
    var total = 0.0;
    for (i <- 0 to (myList.length - 1)) {
      total += myList(i);
    }
    println("Total is " + total);

    // Finding the largest element
    var max = myList(0);
    for (i <- 1 to (myList.length - 1)) {
      if (myList(i) > max) max = myList(i);
    }
    println("Max is " + max);

    ////////////////////////////////////////

    var myMatrix = Array.ofDim[Int](3, 3)

    // build a matrix
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        myMatrix(i)(j) = i + j;
      }
    }

    // Print two dimensional array
    for (i <- 0 to 2; j <- 0 to 2) {
      print(" " + myMatrix(i)(j));
      if (j == 2)
        println()
    }

    ////////////////////////////////////

    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)
    var myList3 = Array.concat(myList1, myList2)

    // Print all the array elements
    for (x <- myList3) {
      println(x)
    }

    ////////////////////////////////////

    var myList4 = Array.range(10, 20, 2)
    var myList5 = Array.range(10, 20)
    // Print all the array elements
    for (x <- myList4) {
      print(" " + x)
    }
    println()
    for (x <- myList5) {
      print(" " + x)
    }

  }
}