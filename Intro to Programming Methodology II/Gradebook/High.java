//Name: Richard Wright
//Lab: Final lab
//09/15/2016
//Description: The High class is an extension of the Statistics class. It defines the calculate() method to find the highest lab score for each lab
//             and add it to the array of low scores. It defines the prnt() method to print out the array of high scores. 

public class High extends Statistics{

   //Finds the highest score for each lab and assigns it to an array of high lab scores
   //Pre-condition: An array of instantiated Student objects and an abstract method Calculate in Statistics class
   //Post-condition: An array of instantiated Student objects and a defined integer array
   public void calculate(Student[] s){
      
      Student[] std = s;

      for( int i = 0; i < NUMBER_OF_CSC20_LABS; i++ ){
      
         int high = std[0].getScore(i);
      
         for( int x = 0; x < std.length; x++){
         
            if( std[x].getScore(i) > high ){ high = std[x].getScore(i); }
         
         }
         
         highScores[i] = high;
      
      }
   
   }
   
   //Pre-condition: A defined integer array and an abstract prnt() method in Statistics class
   //Post-condition: A defined integer array
   public void prnt(){ System.out.print( "High Scores: " ); 
                       for(int i = 0; i < highScores.length; i++){ System.out.print( " " + highScores[i] + " " ); } 
                       System.out.println(); }
                       
}