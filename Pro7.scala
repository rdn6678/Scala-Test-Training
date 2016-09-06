import scala.collection.mutable.ListBuffer

/**
  * Created by renuka on 2/9/16.
  */
object Pro7 extends App {

  def flatten(list: List[List[Int]]):List[Int] = {
      var i =0
    var l = new ListBuffer[Int]
    while(i<=list.length-1){
      l = l++list(i)
      i=i+1

    }
    l.toList
  }

  val a  = List(2,3,4)
  val b = List(5,6,7)
  val s = List(a,b,List(10,90,70))

  println(s)

  println(flatten(s))
}
