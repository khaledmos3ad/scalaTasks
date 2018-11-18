object Palindrome{
   def main(args: Array[String]) {
       println("Palindrome Results : ")
       println("noon is  :"+ isPalindrome("noon"))
       println("apple is  :"+ isPalindrome("apple"))
       println("Madam  :"+ isPalindrome("madam"))
       println("Radar  :"+ isPalindrome("radar"))
       println("Refer  :"+ isPalindrome("refer"))
       println("Mom  :"+ isPalindrome("mom"))
       println("Wow  :"+ isPalindrome("wow"))  
   }
   
   def isPalindrome(string: String): Boolean = {
    string == string.reverse
   }
 
}
