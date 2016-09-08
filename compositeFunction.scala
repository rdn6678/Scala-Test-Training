/**
  * Created by renuka on 8/9/16.
  */
object compositeFunction extends App{

  def square(x:Int):Int= {
    x*x
  }

  def adder(x:Int):Int = {
    x+x
  }
  /*
    The arithmatic fuction can take any function and hence is a higher order function

    */

  def arithmetic(f:(Int=>Int),list: List[Int]):List[Int]={

    list.map(x=>f(x))
  }

  print("The output for the arithmetic composite function\n")
  println(arithmetic(square,List(1,2,3,4,5)))
  println(arithmetic(adder,List(1,2,3,4,5)))

}
