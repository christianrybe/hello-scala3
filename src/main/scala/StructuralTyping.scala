@main def structuralTyping =
  class Record(elems: (String, Any)*) extends Selectable:
    private val fields = elems.toMap
    def selectDynamic(name: String): Any = fields(name)

  type Person = Record { val name: String; val age: Int }

  def chooseOnlyPerson(p: Person) = p.name

  val p = Record("name" -> "Chris", "another" -> 2).asInstanceOf[Person]

  println(chooseOnlyPerson(p))
