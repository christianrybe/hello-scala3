@main def unionTypes =
  type IntOrString = Int | String
  type Cities = "London" | "Warsaw" | "Barcelona"
  type NewType = 3 | 4 | 5 | "why would you do that!?"

  // val x: NewType = "Why would you do that!?" // Won't compile - it has a typo

  trait Printable
  trait Wrappable
  class Compliant extends Wrappable, Printable
  class NonCompliant extends Wrappable

  type IntersectionType = Printable & Wrappable
  val first: IntersectionType = Compliant();
//  val second: IntersectionType = NonCompliant(); // Won't compile
