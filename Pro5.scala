import scala.collection.mutable.ListBuffer

/**
  * Created by renuka on 1/9/16.
  */
object Pro5 extends App {

  def reverse(list:List[Int]):ListBuffer[Int] = {

    val a  = list.length-1
//var l = ListBuffer
var l = new ListBuffer[Int]()

    for(i<-a to (0,-1)){
      l += list(i)
    }
    //println(l)
    l
  }

  val l = List(5,6,7,8,3,6,8,9)
  println(reverse(l))

}
