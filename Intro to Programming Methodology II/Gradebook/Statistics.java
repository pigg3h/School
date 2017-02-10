//Name: Richard Wright
//Lab: Final lab
//09/15/2016
//Description: The Statistics class contains arrays to hold the lowest, highest, and average scores for each lab.
//             It also contains the abstract method calculate(), and the abstract method prnt(). 

abstract class Statistics implements Printable{

   int[] lowScores = new int[NUMBER_OF_CSC20_LABS];
   int[] highScores = new int[NUMBER_OF_CSC20_LABS];
   float[] avgScores = new float[NUMBER_OF_CSC20_LABS];
   
   //Pre-condition: A method calculate() defined in a class that extends the Statistics class
   //               and an array of instantiated Student objects
   //Post-condition: A method calculate() defined in a class that extends the Statistics class
   //                and an array of instantiated Student objects
   abstract public void calculate(Student[] s);
   
   //print values of instance variables
   //Pre-condition: A method prnt() defined in a class that extends the Statistics class
   //Post-condition: A method prnt() defined in a class that extends the Statistics class
   abstract public void prnt();

}