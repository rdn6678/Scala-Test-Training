/**
  * Created by renuka on 23/8/16.
  */
class Question2 {

  def fibo : Int = {

    var n = 0
    var m = 1

    var i = 0
    var sum = 0

    while(i<4000000)
    {
      sum = n + m
      n = m
      m = sum
      i = sum

    }
    sum
  }
}


object Question2 extends App {

  val q2 = new Question2

  println("The sum of the fibo series is : " + q2.fibo)




}
