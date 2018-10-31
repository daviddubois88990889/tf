object HelloWorld {
  def square(x: Int): Int = x*x

  val list = List(1, 2, 3)

  def prList(): Unit = {
    list.foreach(x => println(x))
    list.foreach(println)

    list.map(x => x + 2)
    println(list.map(_ + 2))

    list.filter(x => x % 2 == 1)
    println(list.filter(_ % 2 == 1))

    list.reduce((x, y) => x + y)
    println(list.reduce(_ + _))
  }

  def main(args: Array[String]){
    println(square(10))
    prList()
    println("HW")
  }
}

