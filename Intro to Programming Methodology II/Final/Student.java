//Name: Richard Wright
//Lab: Final lab
//09/15/2016
//Description: The Student class is used to construct and manipulate Student objects. It contains the overloaded constructor Student().
//             It also contains various getter and setter methods to retrieve or change values in a Student object. Since the Student class
//             implements the Printable interface, it must also define a prnt() method. The prnt() method in the Student class prints a formatted
//             line to system output which displays the student's ID and lab scores.            

public class Student implements Printable{
   
   private int SID;
   private int labScores[] = new int[NUMBER_OF_CSC20_LABS];
   
   //Constructor
   public Student(int id, int[] sc){
   
      SID = id;
      
      for( int i = 0; i < labScores.length; i++){ labScores[i] = sc[i]; }
   
   }   
   
   //Null constructor
   public Student(){
   
      SID = 0;
      
      for( int i = 0; i < labScores.length; i++){ labScores[i] = 0; }
   
   }
   
   //Pre-condition: Instantiated Student object and some 4-digit integer
   //Post-condition: Instantiated Student object  
   public void setSID(int id){ SID = id; }
   
   //Pre-condition: Instantiated Student object
   //Post-condition: Instantiated Student object and a 4-digit integer  
   public int getSID(){ return SID; }
   
   //Pre-condition: Instantiated Student object and some integer i, where i is less
   //               than or equal to NUMBER_OF_CSC20_LABS, and some integer s, 
   //               where s is between 0 and 100
   //Post-condition: Instantiated Student object   
   public void setScore(int i, int s){ labScores[i] = s; }
   
   //Pre-condition: Instantiated Student object and some integer i, where i is less
   //               than or equal to NUMBER_OF_CSC20_LABS
   //Post-condition: Instantiated Student object and an integer
   public int getScore(int i){ return labScores[i]; }
   
   //Pre-condition: Instantiated Student object and an integer array of size x, where x is less
   //               than or equal to NUMBER_OF_CSC20_LABS
   //Post-condition: Instantiated Student object
   public void setAllScores(int[] ls){ for( int i = 0; i < labScores.length; i++){ labScores[i] = ls[i]; } }
   
   //Pre-condition: Instantiated Student object
   //Post-condition: Instantiated Student object and an integer array
   public int[] getAllScores(){ return labScores; }
   
   //Pre-condition: Instantiated Student object
   //Post-condition: Instantiated Student object
   public void prnt(){ System.out.printf("%d  %2d   %2d   %2d   %2d   %2d\n", getSID(), getScore(0), getScore(1), getScore(2), getScore(3), getScore(4)); }
   
   //method to print values of instance variables
   //Pre-condition: Instantiated Student object
   //Post-condition: Instantiated Student object
   public String toString(){
   
      return "Student ID: " + getSID() + "\n\nLab Scores\n" + "Lab 1: " + getScore(0) + "\nLab 2: " + 
              getScore(1) + "\nLab 3: " + getScore(2) + "\nLab 4: " + getScore(3) + "\nLab 5: " + getScore(4) + "\n\n";


   
   }

}