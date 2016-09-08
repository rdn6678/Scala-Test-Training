/**
  * Created by renuka on 7/9/16.
  */
object RecursiveBiasedChandan extends App {

  def rbc(list:List[Int], prevValue:Int, sum:Int):Int = {
    if (list != Nil) {
      if (list.head != 0) {
        rbc(list.tail,list.head,sum + list.head)
      }
      else {
        rbc(list.tail,list.head,sum - prevValue)
      }
    }else sum
  }

  println(rbc(List(2,3,0,7,0),0,0))

}
