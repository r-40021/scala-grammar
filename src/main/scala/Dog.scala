class Dog(private val name: String) {
  def greet(): Unit = println(s"${name}だワン")
}

object Jiro extends Dog("ジロウ")

object Dog {
  def apply(name: String) = new Dog(name)

  def apply(id: Int) = new Dog(s"番号付き犬${id}番")

  def printName(dog: Dog): Unit = println(dog.name)
}