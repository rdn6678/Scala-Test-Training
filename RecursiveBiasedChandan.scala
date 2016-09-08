import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
  * Created by renuka on 7/9/16.
  */
object RecursiveBiasedChandan extends App {
  val x = new ListBuffer[Int]()

  def rbc(list:List[Int]):ListBuffer[Int] = {


    if (list.length > 1) {
      if (list.tail.head != 0) {
        x += list.head
        //println(x)
        rbc(list.tail)
      }
      else {
        x += 0
        rbc(list.tail)

      }
    }
    else {
      x += list.last
      x
    }

  }
  val ans = rbc(List(2,3,0,7,0))
  println(ans)
  println(ans.sum)

}
