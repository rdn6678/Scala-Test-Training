import scala.collection.mutable.ListBuffer

/**
  * Created by renuka on 6/9/16.
  */
object Pro10 extends App{

 /* def encode(list:List[Char]):Unit ={

    var l = new ListBuffer[Char]
    for(i<-0 until   list.length-1){
      if(list(i)!=list(i+1) || (i==list.length-2)){

        l+=list(i)
      }
      else
        Nil

    }*/

  def encode(list: List[Char]): List[(Char,Int)] ={
    list.foldLeft(List[(Char,Int)]()){ (r,c) =>
      r match {
        case (value, count) :: tail =>
          if (value == c) (c, count+1) :: tail
          else            (c, 1) :: r
        case Nil =>
          (c, 1) :: r
      }
    }.reverse

    //val m3 = l.map((a:Char)=>(list.count((b:Char)=>a==b),a))

    //println(m3)

  }

  println(encode(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))


}
