trait Greeter2 {
  def greet(): Unit
}

trait Robot2 extends Greeter2 {
  def start(): Unit = greet()
  override final def toString = "Robot2"
}

trait HelloGreeter2 extends Greeter2 {
  def greet(): Unit  = println("Hello!")
}