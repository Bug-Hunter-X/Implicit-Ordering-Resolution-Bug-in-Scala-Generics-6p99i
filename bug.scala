```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: T => Ordered[T]): T = value
}

object Main extends App {
  val myInt = new MyClass(5)
  println(myInt.myMethod) //This will compile and work fine.

  val myString = new MyClass("hello")
  println(myString.myMethod) //This will not compile without an implicit Ordering[String]
}
```