import scala.language.strictEquality

case class Money(val value: Int)
case class Time(val value: Int)

@main def multiversal: Unit =
  println("Starting main")
//  println(Money(1) == Time(1)) // Won't compile!
