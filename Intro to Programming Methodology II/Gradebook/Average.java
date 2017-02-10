//Name: Richard Wright
//Lab: Final lab
//09/15/2016
//Description: The Average class is an extension of the Statistics class. It defines the calculate() method to calculate the average score for each lab
//             and add it to the array of average scores. It defines the prnt() method to print out the array of average scores.

public class Average extends Statistics{

   //calculates the average score for each lab and assigns it to an array of lab averages
   //Pre-condition: An array of instantiated Student objects and an abstract method calculate() in Statistics class
   //Post-condition: An array of instantiated Student objects and a defined float array   
   public void calculate(Student[] s){
   
      Student[] std = s;
      
      for( int i = 0; i < NUMBER_OF_CSC20_LABS; i++ ){
      
         int sum = 0;
      
         for( int x = 0; x < std.length; x++){
         
            sum = sum + std[x].getScore(i);
         
         }
         
         avgScores[i] = sum / NUMBER_OF_CSC20_LABS;
      
      }
   
   }
   
   //Pre-condition: A defined float array and an abstract prnt() method in Statistics class
   //Post-condition: A defined float array
   public void prnt(){ System.out.print( "Average: " ); 
                       for(int i = 0; i < avgScores.length; i++){ System.out.print( " " + avgScores[i] + " " ); } 
                       System.out.println(); }
}