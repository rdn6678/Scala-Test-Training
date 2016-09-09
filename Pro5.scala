object Pro5 extends App {


  def reverseFold(list: List[Int]):List[Int] = {

    list.foldLeft(List[Int]())((r,c)=>c::r)
  }

  val l = List(5,6,7,8,3,6,8,9)
  println(l)
  println(reverseFold(l))

}
