/**
  * Created by renuka on 7/9/16.
  */
object RecursiveSpeed extends App{
  var count = 1
  def rspeed(arr: Array[Int]):Int = {

    if (arr.length>1) {
      if (arr.tail.head > arr.head) {
        Nil
      }
      else {
        count += 1
      }
      rspeed(arr.tail)

    }
    else{
      count
    }

  }


  println(rspeed(Array(8,3,6)))

}
