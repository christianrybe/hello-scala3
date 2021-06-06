import scala.util.{Failure, Success, Try}

case class LoggingContext(ip: String, username: String) {
//  def override this(ip: String, username: String) = this(ip, username)
}
object LoggingContext {
  def apply(ip: String, username: String): LoggingContext = {
    println("Creating")
    return new LoggingContext(ip, username)
  }
}

def makeTransfer(amount: Long)(using c: => LoggingContext) =
//  println(s"""${c.username} is making a transfer""")
  println("Transfer executed")

@main def context =
  given LoggingContext = LoggingContext("192", "rocker")
  makeTransfer(100L)
