import scala.collection.mutable.ListBuffer

/**
  * Created by renuka on 23/8/16.
  */
class Question2 {

  //val fiblist:List[Int] = {

    def fibo: Unit = {

      var first = 0
      var second = 1
      val fiblist = new ListBuffer[Int]
      var i = 0
      var sum = 0


      while (i < 4000000) {
        sum = first + second

        fiblist += sum

        first = second
        second = sum
        i = sum

      }
      println(fiblist)

      val sum1 = fiblist.filter(x => (x % 2  == 0)).sum

      println("The sum of the even valued terms is:==" + sum1)

    }
  //}

}


object Question2 extends App {

  val q2 = new Question2

  q2.fibo




}
