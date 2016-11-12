package example

/**
  * Created by andrewstorey on 2016-10-30.
  */
object Example extends  App {
  println("Hello")
  println("h5")


  def v1 = 2      // evaluated when called
  println(v1)

  val v2 = 99
  println(v2)

  def cube(x: Int) = x * x * x

  println(cube(v1))
}
