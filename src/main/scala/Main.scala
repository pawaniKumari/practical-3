object Main extends App {

  //Q1
  def reverseString(str: String): String = {
    if (str.isEmpty) ""  // Base case
    else reverseString(str.tail) + str.head  
  }

  println("Enter a string:")
  val string = scala.io.StdIn.readLine() 

  println(reverseString(string));

  //Q2
  def fiveLengthStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }

  val list: List[String] = List("Give", "Coming", "moving", "Eat", "kindOf");
  val stringList = fiveLengthStrings(list);
  println(s"Filtered List: $stringList");

  //Q3
  def average(num1: Int, num2: Int) = {
    var average = (num1 + num2)/2;
    println(f"$average%.2f");
  }

  println("Enter the 2 numbers:");
  var num1:Int = scala.io.StdIn.readLine().toInt;
  var num2:Int = scala.io.StdIn.readLine().toInt;

   average(num1,num2);

  //Q4
  def sumOfEvenNumbers(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }

  val list = List(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
  val sum = sumOfEvenNumbers(list);
  println(s"Sum of even numbers: $sum");


}