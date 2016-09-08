import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
  * Created by renuka on 7/9/16.
  */
object biasedChandan extends App {

  def check(arr: Array[Int]): Unit = {

    for(i<-0 to arr.length-1){
      if(arr(i)==0){
        arr(i-1)=0
      }
    }
    val sorted = arr.toList
    val fsum = sorted.sum
    println(fsum)
  }

  val nos = scala.io.StdIn.readLine().toInt
  var c=0
  var l = ListBuffer[Int]()
  while(c<nos){
    val input = scala.io.StdIn.readLine().toInt
     l+=input
    c=c+1
  }

  check(l.toArray)

}
