case class Course(id: Int)
case class Driver(name: String)
object NoDriver extends Driver("no-driver")

trait Ridable {

  def ride(driver: Driver): Unit

}

trait Runnable {

  def run(course: Course): Unit

}

class Bicycle extends Ridable with Runnable {
  private[this] var currentDriver: Driver = NoDriver
  def ride(name: Driver): Unit = currentDriver = name
  def run(course: Course): Unit = println(s"${currentDriver.name} finish Course ${course.id}.")
}