
/**
  * Created by renuka on 1/9/16.
  */
object Pro4 extends App {

  def length(list: List[Int],c:Int):Int = {
    if (list!=Nil){
      length(list.tail,c+1)
    }
    else
    {
      c
    }
  }

  //Alternate method
  def lengthCount(list:List[Int]):Int = {
    list.foldLeft(0)((count,_)=>count+1)
  }


  /*var x = false
  val list = MutableList[Any]()
  while (!x) {
    val input = scala.io.StdIn.readInt()
    list += input
    if (input == 0){ x = true ; println("Bye!"); sys.exit}

  }*/

  val l = List(3,4,5,2,7,9,1,4,6,8,9,9,5,34,3,2,8,8,9)
  println(length(l,0))
  println(lengthCount(l))
}
