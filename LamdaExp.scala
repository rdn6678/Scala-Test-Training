import scala.collection.mutable.ListBuffer

/**
  * Created by renuka on 1/9/16.
  */
object LamdaExp extends App {

  val square: (Int=>Int) = (a:Int)=> a*a

def operationSquare(f:Int=>Int)(list: List[Int]): ListBuffer[Int] = {

  var l = new ListBuffer[Int]()

  for(i<-list){

    l += f(i)
  }
  l

}
  println(operationSquare(square)(List(1,2,3,4,5)))

}
