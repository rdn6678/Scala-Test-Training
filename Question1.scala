/**
  * Created by renuka on 23/8/16.
  */
object Question1 {

  def main(args: Array[String]): Unit = {

    val list: List[Int]  = (1 to 100).toList

    val multiples = list.filter(x => (x%3 == 0) || (x%5 == 0) )

    println(multiples)

    val sumofmultiples = multiples.sum

    println(sumofmultiples)

  }



}
