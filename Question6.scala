/**
  * Created by renuka on 26/8/16.
  */
class Question6 {
  var j = 1
  var sum = 0
  var sum2 = 0
  var num = 100
  var count = 0

  def sumsq(i: Int): Int = {

    j = i * i
    sum += j
    count = i + 1
    if (count <= num) {
      sumsq(count)
    }
    else {
      sum
    }

  }

  def sqsum(i:Int): Int = {

    sum2 += i
    count = i + 1
    if(count <= num){
      sqsum(count)
    }
    else
      {
        j = sum2 * sum2
        j
      }

  }
}

object Question6 extends App {

  val as = new Question6
  val diff = as.sqsum(1) - as.sumsq(1)
  println("The difference is : " + diff)
}