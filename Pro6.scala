/**
  * Created by renuka on 2/9/16.
  */
object Pro6 extends App {

  def isPalindrome(list: List[Int]): Boolean = {

   if(list==list.reverse){
     true
   }
    else{
     false
   }

  }

  val l = List(1,2,3,4,5)

  if(isPalindrome(l)==true){
    println("The list---> "+l+" is a palindrome")
  }
  else
    {
      println("The list--->" +l+" is not a palindrome")
    }

}
