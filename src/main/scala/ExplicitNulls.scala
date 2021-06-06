@main def explicitNulls: Unit =
  println("Hello world!")

  val maybeNull: String | Null = "somehing"
  val option = Option(maybeNull)

  println(maybeNull)
//  println(maybeNull.length) // won't compile!
  println(option)

  val x =
    if maybeNull == null then 0
    else
      val typed: String = maybeNull
      maybeNull.length

//  val z = maybeNull.length // illegal!

  println(x)
