//Name: Richard Wright
//Lab: Final lab
//09/15/2016
//Description: Util class contains the method readFile which takes a file name and an array of Student objects as parameters
//             It then reads the, seperating the line's into a String array and tokenizes the lines into integers which are 
//             set into each Student of the array. Each line is a unique Student, and each token is a certain piece of information
//             (ie. the Student's 4-digit ID number and their respective lab scores).

import java.io.*;

public class Util{

   //Pre-condition: File "filename" must exist and an array of Student objects of some length x
   //Post-condition: An array of Student objects of some length x
   static Student[] readFile(String filename, Student[] s) throws IOException{
   
      // Reads the file and builds student array.
      Student[] std = new Student[s.length];
            
      // Open the file using FileReader Object.
      FileReader fr = new FileReader(filename);
      BufferedReader br = new BufferedReader(fr);
      
      // In a loop read a line using readLine method.
      String[] lineArr = new String[std.length];
      
      String readString = br.readLine();
      
      for(int i = 0; i < lineArr.length; i++){
      
         lineArr[i] = readString;
         readString = br.readLine();
      
      }
      
      br.close();      
            
      // Tokenize each line using StringTokenizer Object   
      // Each token is converted from String to Integer using parseInt method 
      // Value is then saved in the right property of Student Object.  
      for(int i = 0; i < lineArr.length; i++){
      
         String[] tknString = lineArr[i].split("\\s");
         int[] tknInt = new int[tknString.length];
         int[] scores = new int[tknInt.length - 1];
         
         for( int x = 0; x < tknString.length; x++){ tknInt[x] = Integer.parseInt(tknString[x]); }
         
         for( int q = 0; q < scores.length; q++){ scores[q] = tknInt[q+1]; }
      
         Student objStud = new Student(tknInt[0],scores);
         std[i] = objStud;
                     
      }
      
      return std;        
   
   }
   
}