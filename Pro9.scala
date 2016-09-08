import scala.collection.mutable.ListBuffer

/**
  * Created by renuka on 6/9/16.
  */
object Pro9 extends App {

  def ct(list: List[Char]):Unit={
  println(list)

    //var lm = new ListBuffer[Char]
    var i=0
    var count = 1
    for(i<-0 until list.length-1) {
        println(list)
      if (list(i) == list(i + 1)) {
        count += 1
      }
      else{
        println(list.slice(0,count))
        val l = list.slice(count,list.length)
        ct(l)
      }
      //ct(list.slice(count,list.length))

    }



  }

  ct(List('a', 'a', 'a', 'a', 'b','b','b','b'))

}
