@main def explicitNulls: Unit =
  println("Hello world!")

  val maybeNull: String | Null = null
  val option = Option(maybeNull)

  println(maybeNull)
  println(option)

  val x =
    if maybeNull == null then 0
    else maybeNull.length

//  val z = maybeNull.length // illegal!

  println(x)
