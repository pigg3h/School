/**
   Lab Number: 4
   Name: Richard Wright
   Description: Average Grade
   Date: 9/28/16
*/
import java.util.Scanner;

public class CalcAverageForCsc20
{
   public static void main(String[] args)
   {
      // Variable To hold the number of scores
      int numberOfScores;
      
      // Create a Scanner object for keyboard input.
      Scanner userInput = new Scanner(System.in);
            
      // Get the number of test scores.
      System.out.print("How many test scores will be inputted?: ");
      numberOfScores = userInput.nextInt();
      System.out.println();
      
      // Check for number of scores input
      // If number of scores is less than 2, print an error and exit.
      // Otherwise, proceed with steps below.      
      if(numberOfScores < 2){
         
         System.out.println("ERROR: Must input at least two scores."); 
         return;
         
      }

      // Create an array to hold the test scores.
      double[] scores = new double[numberOfScores];
      
      // Get the test scores and store them in the scores array.
      for(int i = 0; i < scores.length; i++){
      
         System.out.printf("Enter score #%d: ", i + 1, "\n");
         
         scores[i] = userInput.nextDouble();
      
      }//end for
      
      System.out.println();

      // Create a Csc20 Grader object, passing the scores array as an argument to the
      // constructor.
      Csc20Grader averageGrade = new Csc20Grader(scores);
            
      // Display the adjusted average.
      System.out.println("Adjusted average score is " + averageGrade.getAverage() + "\n" );
      
      // Display the lowest score.
      System.out.println("Lowest Score is " + averageGrade.getLowestScore());
      
   }
}