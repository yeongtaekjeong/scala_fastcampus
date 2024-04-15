object Oop {
  def main(args: Array[String]): Unit = {
    val myBook1 = new Book(title="My awesome book 1", author = "Paul")
    val myBook2 = new Book(title="My awesome book 2")

    println(myBook1.author)
    println(myBook2.title)
    myBook1.author = "Nancy"
    println(myBook1.author)

    println(s"${myBook2.title} is written by ${myBook2.author}")
  }

}
