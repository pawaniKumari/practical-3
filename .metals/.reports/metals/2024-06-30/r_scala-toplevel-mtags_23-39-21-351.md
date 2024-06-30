error id: file:///C:/Users/aaa/Desktop/FP/activities/practical-3/src/main/scala/Main.scala:[309..310) in Input.VirtualFile("file:///C:/Users/aaa/Desktop/FP/activities/practical-3/src/main/scala/Main.scala", "object Main extends App {

  /*//Q1
  def reverseString(str: String): String = {
    if (str.isEmpty) ""  // Base case
    else reverseString(str.tail) + str.head  
  }

  println("Enter a string:")
  val string = scala.io.StdIn.readLine() 

  println(reverseString(string));*/

  //Q2

   def (strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }
  val list: List[Sting] = List("Give", "Comeing", "moving", "Eat", "kindOf");
}")
file:///C:/Users/aaa/Desktop/FP/activities/practical-3/src/main/scala/Main.scala
file:///C:/Users/aaa/Desktop/FP/activities/practical-3/src/main/scala/Main.scala:16: error: expected identifier; obtained lparen
   def (strings: List[String]): List[String] = {
       ^
#### Short summary: 

expected identifier; obtained lparen