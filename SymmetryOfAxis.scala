/**
  * Created by renuka on 7/9/16.
  */
object SymetryArrayDemo extends App{

    var array1:Array[Array[Int]]=Array(Array(1,0,1),Array(0,0,0),Array(1,0,1))

  array1 foreach { row => row foreach print; println }
  println()

  array1.reverse foreach { row => row foreach print; println }

  if(array1==array1.reverse)
    {
      println("Y")
    }
    else
    {
      println("N")
    }
  }
