/**
  * Created by renuka on 1/9/16.t:
  */
object Pro3 extends App{

  def nth(n: Int,list:List[Int]):Int={

    if(n>=0){
      list(n-1)
    }
    else
      {
        0
      }
  }

  val l = List(3,4,5,7,8,9,10,67,99)
  println(nth(7,l))

}
