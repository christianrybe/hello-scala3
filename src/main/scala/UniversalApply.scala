class UniversalApply(val value: String) {}
case class ThisWasNormal(val value: String)

@main def universal =
  println(ThisWasNormal("Nothing changes"))
  println(UniversalApply("No 'new' required"))
