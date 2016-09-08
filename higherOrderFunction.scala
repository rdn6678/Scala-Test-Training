/**
  * Created by renuka on 8/9/16.
  */
object higherOrderFunction extends App {

  def square(x:Int):Int = {x * x}

  def adder(f:(Int=>Int),x:Int,y:Int):Int = {

    f(x)+f(y)
  }

  def root(x:Int)= scala.math.pow(x,0.5)

  println("Numbers are := 2 5")

  println("The squares are:="+square(2)+ " " + square(5))

  println("The summation is:="+adder(square,2,5))

  println("The final root is:="+root(adder(square,2,2)))

}
