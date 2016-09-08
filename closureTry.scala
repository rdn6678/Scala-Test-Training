/**
  * Created by renuka on 8/9/16.
  */
object closureTry extends App {
/*
Not a pure function because the value of the method "myprint" depends
on the value of the variable "msg" which is defined outside
its scope.
*/

  def printer :String = {
    val msg = "Hello"

    def myPrint:String = {
      msg
    }
    myPrint
  }

  /*
      Is a pure function because the value of the method
     "myPrintf" does not depend on any variables outside its scope
  */

  def printerf(message:String) = {
    def myprintf:String = {
      message
    }
  myprintf
  }

  def modPrinter(msg:String) = {

    val modmsg = "abc"+msg
    def myModPrinter: String = {

      modmsg
    }
    myModPrinter
  }

  println(printer)

  println(printerf("Hello"))

  println(modPrinter("Run"))

}
