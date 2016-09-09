/**
  * Created by renuka on 9/9/16.
  */
object operatorMatching extends App{

  def check(o:Operator):Int =o match{

    case Operator(a,"+",b)=> a.toInt+b.toInt
    case Operator(a,"-",b)=> a.toInt-b.toInt
    case Operator(a,"*",b)=> a.toInt*b.toInt
    case Operator(a,"/",b)=> a.toInt/b.toInt
    case _=> 0
  }

  def verify(v:Verification):Unit = {
    if(v.expected==v.actual){
      println("Test Case " + v.tno +" passed")
      println("Expected: "+ v.expected)
      println("Actual: " + v.actual)
      println("-------------------------------------------")
    }
    else
    {
      println("Case failed")
      println("-------------------------------------------")
    }


  }
  val input1 = Operator("10","+","5")
  val act1 = check(input1)
  val v1 = Verification(15,act1,1)
  verify(v1)

  val input2 = Operator("10","-","5")
  val act2 = check(input2)
  val v2 = Verification(5,act2,1)
  verify(v2)

  val input3 = Operator("10","*","5")
  val act3 = check(input3)
  val v3 = Verification(50,act3,1)
  verify(v3)

  val input4 = Operator("10","/","5")
  val act4 = check(input4)
  val v4 = Verification(2,act4,1)
  verify(v4)



}

case class Operator(op1:String,op:String,op2:String)
case class Verification(expected:Int,actual:Int,tno:Int)