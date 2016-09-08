import scala.collection.mutable

/**
  * Created by renuka on 7/9/16.
  */
object RecursiveSpeed extends App{

  def rspeed(l: List[Int],sum:Int):Int = {

    if (l.length>1) {
      if (l.tail.head > l.head) {
        rspeed(l.tail,sum)
      }
      else {
        rspeed(l.tail,sum+1)
      }
    }
    else{
      sum
    }

  }


  println(rspeed(List(4,5,1,2,3),1))

}
