/**
  * Created by renuka on 6/9/16.
  */
object StudentMap extends App {

  var m = Map.empty[Int, String]
   def inputMap(key:Int,value:String):Map[Int,String]={

     m+=(key->value)
       //println(m.toString())
     m
   }

  def searchMap(myvalue:String,smap:Map[Int,String]):Unit={
    var finalmap = Map.empty[Int,String]

    finalmap = smap.filter(x=>x._2==myvalue)
      println(finalmap.toString())


  }

  def delMap(myDelKey:Int,dmap:Map[Int,String]):Map[Int,String]={
    var finalmap = Map.empty[Int,String]
    if(dmap.contains(myDelKey)){
      finalmap = dmap-myDelKey
    }
    else
      {
        println("Key not present")
      }
    finalmap
  }


  val nos = scala.io.StdIn.readLine("ENter total size").toInt
  var i = 0
  var actmap = Map.empty[Int, String]
  while(i<nos){
    val key = scala.io.StdIn.readLine("ENter the key").toInt
    val value = scala.io.StdIn.readLine("ENter the value")
    actmap = inputMap(key,value)
    i+=1
  }
  println(actmap)

  val svalues = scala.io.StdIn.readLine("Enter the value to search")
  searchMap(svalues,actmap)

  val dkey = scala.io.StdIn.readLine("Enter the key to delete").toInt
  println(delMap(dkey,actmap))





}
