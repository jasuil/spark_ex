package com.scalademo.basic

object Ex10Collection {

  def main(args: Array[String]): Unit = {

    //val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
    //val fruit = "apples" :: "oranges" :: "pears" :: Nil
    val fruit = List("apples", "oranges", "peras")
    val nums = Nil
    println("Length of fruit : " + fruit.size)
    println("Head of fruit : " + fruit.head)
    println("Tail of fruit : " + fruit.tail)
    println("Second member of fruit : " + fruit(2))
    println("Min of fruit : " + fruit.min)
    println("Check if fruit is empty : " + fruit.isEmpty)
    println("Check if nums is empty : " + nums.isEmpty)

    /////////////////////////////////////////////////

    val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val fruit2 = "mangoes" :: ("banana" :: Nil)
    // use two or more lists with ::: operator
    var fruit3 = fruit1 ::: fruit2
    println("fruit1 ::: fruit2 : " + fruit3)

    // use two lists with Set.:::() method
    fruit3 = fruit1.:::(fruit2)
    println("fruit1.:::(fruit2) : " + fruit3)
    // pass two or more lists as arguments
    fruit3 = List.concat(fruit1, fruit2)
    println("List.concat(fruit1, fruit2) : " + fruit3)

    /////////////////////////////////////////////
    val fruit4 = Set("apples", "oranges", "pears", "pears")
    val nums4: Set[Int] = Set()
    println("Head of fruit : " + fruit4.head)
    println("Tail of fruit : " + fruit4.tail)
    println("Tail of fruit : " + fruit4.size)
    println("Check if fruit is empty : " + fruit4.isEmpty)
    println("Check if nums is empty : " + nums4.isEmpty)

    ////////////////////////////////////////

    val fruit5 = Set("apples", "oranges", "pears")
    val fruit6 = Set("mangoes", "banana")
    // use two or more sets with ++ as operator
    var fruit7 = fruit5 ++ fruit6
    println("fruit1 ++ fruit2 : " + fruit7)
    // use two sets with ++ as method
    fruit7 = fruit5.++(fruit6)
    println("fruit1.++(fruit2) : " + fruit7)

    //////////////////////////////////

    val num1 = Set(5, 6, 9, 20, 30, 45)
    val num2 = Set(50, 60, 9, 20, 35, 55)
    // find common elements between two sets
    println("num1.&(num2) : " + num1.&(num2))
    println("num1.intersect(num2) : " + num1.intersect(num2))
    println("num1.|(num2) : " + num1.|(num2))

    ///////////////////////////////////////

    val colors = Map(
      "red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F")
    val nums8: Map[Int, Int] = Map()
    println("Keys in colors : " + colors.keys)
    println("Values in colors : " + colors.values)
    println("red in colors : " + colors("red"))
    println("Check if colors is empty : " + colors.isEmpty)
    println("Check if nums is empty : " + nums8.isEmpty)

    ////////////////////////////////////////////

    val colors1 = Map(
      "red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F")
    val colors2 = Map(
      "blue" -> "#0033FF",
      "yellow" -> "#FFFF00",
      "red" -> "#FF0000",
      "peru" -> "#CD8530")
    // use two or more Maps with ++ as operator
    var colors3 = colors1 ++ colors2
    println("colors1 ++ colors2 : " + colors3)

    // use two maps with ++ as method
    colors3 = colors1.++(colors2)
    println("colors1.++(colors2)) : " + colors3)

    //////////////////////////////////////////////

    val t = (4, 3, 2, 1)
    println("first element: " + t._1)
    val sum = t._1 + t._2 + t._3 + t._4
    println("Sum of elements: " + sum)

    t.productIterator.foreach(i => println("Value = " + i))

    ///////////////////////////////////

    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

    println("show(capitals.get( \"Japan\")) : " + show(capitals.get("Japan")))
    println("show(capitals.get( \"India\")) : " + show(capitals.get("India")))

    val a: Option[Int] = Some(5)
    val b: Option[Int] = None

    println("a.getOrElse(0): " + a.getOrElse(0))
    println("b.getOrElse(10): " + b.getOrElse(10))

  }

  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None    => "?"
  }

}