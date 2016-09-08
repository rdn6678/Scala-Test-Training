/**
  * Created by renuka on 6/9/16.
  */
object SumofWeights extends App {

  val m=List(1,2,3,3,4,5,6)
  println(m)
  println(m.distinct)
  val m1=(m.distinct).map((a:Int)=>(a,m.count((b:Int)=>a==b)))
  println(m1)
  val m2=m1.filter(x=>x._2==1)
  println(m2)
  val m3=m2.map(x=>x._1)
  println(m3)
  println(m3.map(x=>x*(m.indexOf(x)+1)))
  println("Weightes Sum=")
  println(m3.map(x=>x*(m.indexOf(x)+1)).sum)


}
