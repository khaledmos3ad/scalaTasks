object Palindrome{
   def main(args: Array[String]) {
       println(isPalindrome("noon"))
       println(isPalindrome("apple"))
       

   }
   
   def isPalindrome(string: String): Boolean = {
    string == string.reverse
}
 
}
