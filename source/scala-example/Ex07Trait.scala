package com.scalademo.basic

object Trait {
  def main(args: Array[String]) {
    val p1 = new Point3(2, 3)
    val p2 = new Point3(2, 4)
    val p3 = new Point3(3, 3)
    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))

  }
}

trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class Point2(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc
  def isEqual(obj: Any) = obj.isInstanceOf[Point2] && obj.asInstanceOf[Point2].x == x
}

abstract class Equal2 {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class Point3(xc: Int, yc: Int) extends Equal2 {
  var x: Int = xc
  var y: Int = yc
  def isEqual(obj: Any) = obj.isInstanceOf[Point3] && obj.asInstanceOf[Point3].x == x
}
