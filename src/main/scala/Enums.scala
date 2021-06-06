enum Job:
  case Manager, Developer, Tester

enum Car(val speed: Int):
  case Lamborghini extends Car(10)
  case Renault extends Car(0)

@main def enums =
  val job = Job.Manager
  val car = Car.Renault
