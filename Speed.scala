import scala.collection.mutable.ListBuffer

/**
  * Created by renuka on 7/9/16.
  */
object Speed extends App {

  def checkSpeed(arr: Array[Int]):Int = {
var count =1
    for(i<-0 until arr.length-1){
      if(arr(i+1)>arr(i)){
        Nil
      }
      else
        count+=1
    }
    count
  }

  val nos = scala.io.StdIn.readLine().toInt
  var c=0
  var l = ListBuffer[Int]()
  while(c<nos){
    val input = scala.io.StdIn.readLine().toInt
    l+=input
    c=c+1
  }

  println(checkSpeed(l.toArray))



}
