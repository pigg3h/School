//Name: Richard Wright
//Lab: Final lab
//09/15/2016
//Description: The Low class is an extension of the Statistics class. It defines the calculate() method to find the lowest lab score for each
//             lab and add it to the array of low scores. It defines the prnt() method to print out the array of low scores. 

public class Low extends Statistics{
   
   //Finds the lowest score for each lab and assigns it to an array of lowest lab scores
   //Pre-condition: An array of instantiated Student objects and an abstract method calculate() in Statistics class
   //Post-condition: An array of instantiated Student objects and a defined integer array
   public void calculate(Student[] s){
      
      Student[] std = s;

      for( int i = 0; i < NUMBER_OF_CSC20_LABS; i++ ){
      
         int low = std[0].getScore(i);
      
         for( int x = 0; x < std.length; x++){
         
            if( std[x].getScore(i) < low ){ low = std[x].getScore(i); }
         
         }
         
         lowScores[i] = low;
      
      }
   
   }
   
   //Pre-condition: A defined integer array and an abstract prnt() method in Statistics class
   //Post-condition: A defined integer array
   public void prnt(){ System.out.print( "Low Scores: " ); 
                       for(int i = 0; i < lowScores.length; i++){ System.out.print( " " + lowScores[i] + " " ); } 
                       System.out.println(); }

}