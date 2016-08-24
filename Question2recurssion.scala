/**
  * Created by renuka on 23/8/16.
  */

class retry{

  var first=0
  var second=1
  var sum=0
  val i=0

  def fibo(n : Int): Unit =  {



    if(i<n){

      sum = first + second
      first = second
      second = sum
      println(sum)
      fibo(n-1)
    }

  }

}

object retry {

  def main(args: Array[String]): Unit = {

    val r1 = new retry
    val num = 40
    r1.fibo(num)
  }
}

