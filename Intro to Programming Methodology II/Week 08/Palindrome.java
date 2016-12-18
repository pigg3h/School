// Name: Richard Wright
// Lab 7
// Description: This class provides method to test if a string is a Palindrome using Stack/Queue ADTs.
// Due: 
import java.util.Stack;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
class Palindrome {
   // This is a main method to test checkPalindrome method
   public static void main(String[] args) {
      String inputString = new String("");
      Scanner in = new Scanner(System.in);
      do {
      
         // please put your code to test checkPalindrome method here
         System.out.print("Please enter a string of characters: ");
         inputString = in.next();
         System.out.println();
         
         int pdrome = checkPalindrome(inputString);
         
         if( pdrome == -1 ){ System.out.println("The string is null."); }
         else if( pdrome == 0 ){ System.out.println( "The string is a palindrome!" ); }
                            
         else{ System.out.println("The given string is not a palindrome.");
               System.out.println();
               System.out.println("The character at position " + pdrome +
                                  " from the left is different from\nthe character at position " + pdrome +
                                  " from the right."); }
                                  
         System.out.println();
         System.out.print("Would you like to try another string (Y/N)? ");
         inputString = in.next();
         System.out.println();
               
      } while ( inputString.equals("y") && inputString.length() == 1 );   
      System.out.print("Bye!"); 
   }
   // This is checkPalindrome method. It checks if an input string is Palindrome or not.
   // It returns 0 if a string is a Palindrome. Otherwise, it returns a position of a character where it finds 
   // a different value.
   // Pre-Condition: string must not be null. 
   // Post-Condition: Return 0 if input string is a Palindrome. Return a positive number to indicate the location where
   //                 a difference found. Return -1 if string is empty or null.
   public static int checkPalindrome(String strValue) {  
      Stack<Character> stack = new Stack<Character>();
      Queue<Character> queue = new LinkedList<Character>();
 
      // check if string is null. If it is null, return a -1
      if( strValue == null || strValue.isEmpty() ){ return -1; }
        
      // normalize the string values to lower case, remove spaces
      strValue = strValue.toLowerCase().replaceAll("\\W", "");
      
      char[] charArray = strValue.toCharArray(); //create array of characters from inputted string

      // store data on stack/queue adts first
      for( int i = 0; i < strValue.length(); i++ ){
        
         stack.push(charArray[i]); //push the array of characters onto stack object
         queue.add(charArray[i]);  //add array of characters to queue object
        
      }
         
      // loop: comparing, retrieving text, terminate loop if stack is emptied or found a difference
      while( stack.isEmpty()!= true && queue.isEmpty() != true ){
      
         for( int ch = 0; ch < strValue.length(); ch++ ){ if( queue.remove() != stack.pop() ){ return ch + 1; } } //compares the top of the stack with beginning of queue
                                                                                                                  //if not equal, return index + 1 (position starting at 1)
         
      }
      
      return 0; 
      
   }
}