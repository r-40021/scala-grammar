class User(private  val name: String, private  val age: Int) {
  override def toString = s"User($name, $age)"
}

object User {
  def apply(nameAndAge: String): User = {
    val split = nameAndAge.split(",")
    new User(split(0), split(1).toInt)
  }

  def printAge(user: User): Unit = println(user.age)
}

object Cache {
  var map: Map[Int, String] = Map(0 -> "")
}

object AddtoCache extends App {
  def putToCheche(i: Int): Unit = {
    Cache.map = Cache.map + ((i + 1) -> (Cache.map(i) + "あああ"))
  }

  val count = 1000000000
  for (i <- 0 to count) putToCheche(i)
}
