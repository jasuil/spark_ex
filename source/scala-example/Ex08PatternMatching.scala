package com.scalademo.basic

object PatternMatching {
  def main(args: Array[String]) = {
    println(matchTest("two"))
    println(matchTest("test"))
    println(matchTest(1))
    println(matchTest(100))

    ////////////////////////////

    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 32)

    for (person <- List(alice, bob, charlie, Person("john doe", 100))) {
      person match {
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32)   => println("Hi Bob!")
        case Person(name, age) =>
          println("Age: " + age + " year, name: " + name + "?")
        case _ => println("????")
      }
    }

  }

  def matchTest(x: Any): Any = x match {
    case 1      => "one"
    case "two"  => 2
    case y: Int => println(y); "scala.Int";
    case _      => "many"
  }

  case class Person(name: String, age: Int)

}