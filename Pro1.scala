/**
  * Created by renuka on 1/9/16.
  */

object Pro1 extends App{

    def tailLast(lst: List[Int]): Int = {

      if(lst.tail!=Nil){
        tailLast(lst.tail)
      }
      else
      {
        lst.head
      }
    }

    val a = List(1,2,3,4)
    println(tailLast(a))
}


