//Name: Richard Wright
//Lab: Final lab
//09/15/2016
//Description: The FinalCountdown class contains the main() method. It also sets up the basic formatting of the list of students/scores.
import java.io.*;

public class FinalCountdown{

   public static void main(String[] args) throws IOException{
   
      Student[] students = new Student[15];
      Statistics[] s = { new Low(), new High(), new Average() };
      
      students = Util.readFile("csc20students.txt", students);
      
      System.out.printf("%s %s %s %s %s %s\n", "Stud", "Lab1", "Lab2", "Lab3", "Lab4", "Lab5");
      for(int i = 0; i < students.length; i++){ students[i].prnt(); }
      System.out.println();
      
      for(int x = 0; x < s.length; x++){ s[x].calculate(students); s[x].prnt(); }     
   
   }

}