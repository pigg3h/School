/**
  Lab Number: 4
  Name: Richard Wright
  Description: Calculate Average Grade
  Date: 9/28/16
*/
public class Csc20Grader
{
   // The testScores field is a variable
   // that will reference an array
   // of test scores.
   private double[] testScores;

   /**
      Constructor
      scoreArray An array of test scores.
   */   
   public Csc20Grader(double[] scoreArray)
   {
      // Assign the array argument to
      // the testScores field.
      testScores = scoreArray;
   }//end Csc20Grader
   
   /**
      getLowestScore method
      return The lowest test score.
   */   
   public double getLowestScore()
   {
      double lowest = testScores[0]; //first element is assigned to variable "lowest"
      
      //loops through each element, if number is lower than "lowest", that number becomes "lowest"
      for(int i = 0; i < testScores.length; i++){ 
     
         if( testScores[i] < lowest ){ lowest = testScores[i]; }        
     
      }//end for
      
      return lowest; 
      
   }//end getLowestScore
   
   /**
      getAverage method 
      return The average of the test scores
              with the lowest score dropped.

      Important Note: 
      If the array contains less than two test
      scores, display an error message and set average to 0.
              
   */   
   public double getAverage()
   {
   
      if(testScores.length < 2){ 
      
         System.out.println( "Must have at least two test scores to get average" );
         
         return 0;
         
      }else{
      
         double sum = 0;
      
         for(int i = 0; i < testScores.length; i++){
      
            sum = sum + testScores[i];
      
         }//end for
      
         return (sum - this.getLowestScore())/(testScores.length - 1);
         
      }//end if else

   }//end getAverage
   
}//end Csc20Grader