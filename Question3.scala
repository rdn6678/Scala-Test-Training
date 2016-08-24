/**
  * Created by renuka on 24/8/16.
  */
class Question3a {

  def pfactor:Int = {

    var i =2
    var n = 600851475143.00
    var large = 1

    while(n != 1)
      {
            if (n % i == 0)
              {
                 n = n / i

                if(i>large)
                  {
                    large = i
                  }
                i = i + 1
              }
            else
              {
                i = i + 1
              }

      }

    large
  }

}

object Question3a{

  def main(args: Array[String]): Unit = {

    var q3 = new Question3a
    println(q3.pfactor)
  }
}
