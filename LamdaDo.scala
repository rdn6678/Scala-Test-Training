import scala.collection.mutable.ListBuffer

/**
  * Created by renuka on 2/9/16.
  */
object LamdaDo extends App{

  val cond:(List[Int])=>Boolean= (l1:List[Int])=>{
    if(l1.length>0) true else false
  }

  val square: (Int=>Int) = (a:Int)=> a*a
  //var str="y"

  var count=0
  var i = 0

  var newl = new ListBuffer[Int]

  def doWhile(list:List[Int]):ListBuffer[Int]= {

    if(cond(list)) {
      newl += square(list(i))
      doWhile(list.tail)
    }
    else
      {
        newl
      }
  }

  val l = List(1,2,3,4,5,6)
  println(doWhile(l))

}


