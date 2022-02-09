trait Adder {
  self: Calculator =>
  def add(x: Int, y: Int): Unit = println(x + y)
}

trait Subtractor {
  self: Calculator =>
  def subtract(x: Int, y: Int): Unit = println(x - y)
}

trait Multiplier {
  self: Calculator =>
  def multiply(x: Int, y: Int): Unit = println(x * y)
}

trait Divider {
  self: Calculator =>
  def divide(x: Int, y:Int): Unit = println(x / y)
}

class Calculator(x: Int, y: Int) extends Adder with Subtractor with Multiplier with Divider {
  def add():Unit = super[Adder].add(x, y)
  def subtract():Unit = super[Subtractor].subtract(x, y)
  def multiply(): Unit = super[Multiplier].multiply(x, y)
  def divide(): Unit = super[Divider].divide(x, y)
}
