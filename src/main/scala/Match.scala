import java.security.SecureRandom
import scala.util.Random

object Match {
  def patternMatch(): Unit = {
    val seq = Seq("A", "B", "C", "D", "E")
    seq match {
      case Seq("A", b, c, d, e) =>
        println("b = " + b)
        println("c = " + c)
        println("d = " + d)
        println("e = " + e)
      case _ =>
        println("nothing")
    }
  }

  def patternMatchNest(): Unit = {
    val seq = Seq(Seq("A"), Seq("B", "C", "D", "E"))
    seq match {
      case Seq(a@Seq("A"), x) =>
        println(a)
        println(x)
      case _ => println("nothing")
    }
  }

  def patternMatchType(): Unit = {
    val obj: AnyRef = "String Literal"
    obj match {
      case v: java.lang.Integer => println("Integer!")
      case v: String => println(s"String! length is ${v.length}")
    }
  }

  def patternMatchGenerics(): Unit = {
    val obj: AnyRef = Seq("a", "b", "c")
    obj match {
      case v: Seq[_] => println("Seq[_]")
      case _ => print("nothing")
    }
  }

  def printRandomChars(): Unit = {
    for (i <- 1 to 1000) {
      val chars: Seq[Char] = new Random(new SecureRandom()).alphanumeric.take(5).toList
      val result = chars match {
        case Seq(a, b, c, d, _) => Seq(a, b, c, d, a)
      }
      println((result))
    }
  }

  def last(seq: Seq[Int]): Int = {
    seq match {
      case Seq(x) => return x
      case x::xs => last(xs)
    }
  }

  def reverse(seq: Seq[Int]): Seq[Int] = {
    seq match {
      case Seq(x) => Seq(x)
      case x::xs => reverse(xs) :+ x
    }
  }
}
