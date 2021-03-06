object ControlSyntax {
  def bar(): String = {
    "bar"
  }

  def printOver18(age: Int): Unit = {
    val message = if (age < 18) {
      "18歳未満です"
    } else {
      "18歳以上です"
    }
    println(message)
  }

  def printWhileResult(): Unit = {
    var i = 0
    var result = while(i < 10) i = i + 1
    println(result)
  }

  def doubleLoop(): Unit = {
    for (x <- 1 to 5; y <- 1 until 5 if x != y) {
      println("x = " + x + " y = " + y)
    }
  }

  def collectionLoop(): Seq[String] = for(e <- Seq("A", "B", "C", "D", "E")) yield  "Pre" + e

  def printIsBaby(age: Int, isSchoolStarted: Boolean): Unit = {
    if (age >= 1 && age <= 6 && isSchoolStarted == false) {
      println("幼児です")
    } else {
      println("幼児ではありません")
    }
  }

  def loopFrom0To9(): Unit = {
    var i = 0
    do {
      println(i)
      i = i + 1
    } while (i < 10)
  }

  def printRightTriangles(): Unit = {
    for (a <- 1 to 1000; b <- 1 to 1000; c <- 1 to 1000; if a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
      println((a, b, c))
    }
  }

}