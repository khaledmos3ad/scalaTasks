object FacturialSolution{
   def main(args: Array[String]) {
       println("Factorial of 5 is "+factorial(5))
   }
   
   def factorial(n: Int): Int = n match {
      case 0 => 1
      case _ => n * factorial(n-1)
   }  
 
}
