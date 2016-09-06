
import scala.collection.mutable.ListBuffer

/**
  * Created by renuka on 2/9/16.
  */
class Pro8 {

  def compress(list: List[String]):Unit={

      //var l = new ListBuffer[String]
    for(i<-0 to list.length-2){
      if(list(i)==list(i+1)){
        Nil
      }
      else
        println(list(i))
    }

  }

}

object Pro8 extends App{

  val p8 = new Pro8
  p8.compress(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"))
}


