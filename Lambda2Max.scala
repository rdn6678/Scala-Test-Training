import scala.collection.mutable.ListBuffer

/**
  * Created by renuka on 1/9/16.
  */
object Lambda2Max extends App{

  val max:(Int,Int)=>Int = (a:Int,b:Int)=>{
    if(a>b) a else b
  }

  val sortMax:(Int,Int)=>Int = (a:Int,b:Int)=>{
    if(a>b) 1 else 0
  }

  def sort(f:(Int,Int)=>Int)(arr:Array[Int]): List[Int] = {


val a  = arr.length

    for(i<-0 until a-1) {
      for(j <- 0 until a-1-i)
      {
          if(sortMax(arr(j),arr(j+1))==1)
          {

            val temp=arr(j)
             arr(j)=arr(j+1)
            arr(j+1)=temp
          }
      }
  }
  arr.toList
  }


  def maxSearch(f:(Int,Int)=>Int)(lst:List[Int]):Int = {
    var result = 0

    for (i <-0 to lst.length - 1) {

      result = f(result,lst(i))

    }

    result
  }

  val l = List(40,56,67,2,0)
  println(maxSearch(max)(l))

  val a = Array(23,45,1,2,78,9)
  println(sort(sortMax)(a))


}
