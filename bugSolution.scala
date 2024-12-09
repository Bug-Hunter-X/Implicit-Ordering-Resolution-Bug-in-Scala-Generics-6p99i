```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: T => Ordered[T]): T = value
}

object Main extends App {
  val myInt = new MyClass(5)
  println(myInt.myMethod)

  implicit val stringOrdering: Ordering[String] = Ordering.String
  val myString = new MyClass("hello")
  println(myString.myMethod) //Now this will compile and work fine.
}
```