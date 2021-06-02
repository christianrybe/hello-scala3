@main def significantIndentation =
  var acc = 1
  val unknown = -1

  if (unknown == 0)
    val z = 0
    println("We got a zero, sir!")
  else
    println("We've got something to work with!")
    println(unknown)

    if unknown < 0 then
      acc += unknown
      println(s"""Accumulator decreased: $acc""")
    else
      acc += unknown

      println(s"""Accumulator increased: $acc""")
  end if

  println("Is this inside if?")
