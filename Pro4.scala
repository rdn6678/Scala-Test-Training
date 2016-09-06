import scala.collection.mutable.ListBuffer
import scala.collection.mutable.MutableList

/**
  * Created by renuka on 1/9/16.
  */
object Pro4 extends App {

  def length(list: List[Int]):Int = {
    var count = 1
    var i = 0
    while(i<list.length-1){
      count+=1
      i=i+1
    }
    count

  }


  /*var x = false
  val list = MutableList[Any]()
  while (!x) {
    val input = scala.io.StdIn.readInt()
    list += input
    if (input == 0){ x = true ; println("Bye!"); sys.exit}

  }*/

  val l = List(3,4,5,2,7,9,1,4,6,8,9,9,5,34,3,2)
  println(length(l))
}
