//////////////////////////////////////////////////////////////////////////////////////////
// Lab number: 2                                                                        //
// Name: Richard Wright                                                                 //
// Module Description: Print Multiple of N Digits                                       //
// Date: 09/09/16                                                                       //
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
// Goal: Write program that prompts user for two N digit numbers, where N=1-3, and      //
//       output the product of the two numbers in the format:                           //
//                                  123                                                 //
//                               X  246                                                 //
//                              ---------                                               //
//                                  738                                                 //
//                                 492                                                  //
//                                246                                                   //
//                              ---------                                               //
//                                30258                                                 //
////////////////////////////////////////////////////////////////////////////////////////// 

import java.util.Scanner;

public class PrintMultipleofNDigits{

   private static void printSpace( int s ){ //recursive function to write spaces for formatting
   
      if( s > 0 ){
      
         System.out.print( " " );
         
         printSpace( s - 1 );
      
      }
   
   }
   
   public static void main( String[] args ){

      String num1, num2;
      int prod[] = {0, 0, 0, 0}; //array to store intermediate products to be used by answer variable
      final int answer;
   
      Scanner userInput = new Scanner(System.in);

      do{ //do-while loop that exits when user inputs number with 1-4 digits     
         System.out.println("Please enter a number with one to four digits: ");
      
         num1 = userInput.next();
            
         if( num1.length() > 4 || num1.length() < 1 ){
      
            System.out.println( "ERROR: Number is not between 1-4 digits in length" );
      
         }
      
      }while( num1.length() > 4 || num1.length() < 1 );
      
      do{ //same as above
         System.out.println("Please enter another number with one to four digits: ");
      
         num2 = userInput.next();
      
         if( num2.length() > 4 || num2.length() < 1 ){
      
            System.out.println( "ERROR: Number is not between 1-4 digits in length" );
      
         }
      }while( num2.length() > 4 || num2.length() < 1 );
            
      if( num1.length() < num2.length() ){ //keeps larger number on top of equation and formats accordingly
        
         int s = num2.length() - num1.length();
        
         System.out.println( "   " + num2 );
         System.out.print( " x " );
         printSpace( s );
         System.out.println( num1 );
         System.out.println( "---------" );
        
         for( int i = (num1.length() - 1); i >= 0 ; i-- ){         
         
            int i2 = Integer.parseInt( num2 );
         
            if( num2.length() == 1 || num1.length() == 1 ){
               prod[i] = ( Integer.parseInt(String.valueOf( num1.charAt(i) )) * i2 * (int) Math.pow(10, i) );
               printSpace(i + 3);
            }else if( num2.length() == 2 || num1.length() == 2 ){
               prod[i] = ( Integer.parseInt(String.valueOf( num1.charAt(i) )) * i2 * (int) Math.pow(10, 1-i) );
               printSpace(i + 2);
               System.out.println( Integer.parseInt(String.valueOf( num1.charAt(i) )) * i2 );            
            }else if( num2.length() == 3 || num1.length() == 3){
               prod[i] = ( Integer.parseInt(String.valueOf( num1.charAt(i) )) * i2 * (int) Math.pow(10, 2-i) );
               printSpace(i + 1);
               System.out.println( Integer.parseInt(String.valueOf( num1.charAt(i) )) * i2 );           
            }else if( num2.length() == 4 || num1.length() == 4){
               prod[i] = ( Integer.parseInt(String.valueOf( num1.charAt(i) )) * i2 * (int) Math.pow(10, 3-i) );
               printSpace(i);
               System.out.println( Integer.parseInt(String.valueOf( num1.charAt(i) )) * i2 );            
            }
              
         }//end for loop

      }else{
     
         int s = num1.length() - num2.length();
      
         System.out.println( "   " + num1 );
         System.out.print( " x " );
         printSpace( s );
         System.out.println( num2 );
         System.out.println( "---------" );
      
         for( int i = (num2.length() - 1); i >= 0 ; i-- ){         
         
            int i1 = Integer.parseInt( num1 );
        
            if( num2.length() == 1 || num1.length() == 1 ){
               prod[i] = ( Integer.parseInt(String.valueOf( num2.charAt(i) )) * i1 * (int) Math.pow(10, i) );
               printSpace(i + 3);
            }else if( num2.length() == 2 || num1.length() == 2 ){
               prod[i] = ( Integer.parseInt(String.valueOf( num2.charAt(i) )) * i1 * (int) Math.pow(10, 1-i) );
               printSpace(i + 2);
               System.out.println( Integer.parseInt(String.valueOf( num2.charAt(i) )) * i1 );
            }else if( num2.length() == 3 || num1.length() == 3){
               prod[i] = ( Integer.parseInt(String.valueOf( num2.charAt(i) )) * i1 * (int) Math.pow(10, 2-i) );
               printSpace(i + 1);
               System.out.println( Integer.parseInt(String.valueOf( num2.charAt(i) )) * i1 );
            }else if( num2.length() == 4 || num1.length() == 4){
               prod[i] = ( Integer.parseInt(String.valueOf( num2.charAt(i) )) * i1 * (int) Math.pow(10, 3-i) );
               printSpace(i);
               System.out.println( Integer.parseInt(String.valueOf( num2.charAt(i) )) * i1 );
            }
              
         }//end for loop
      
      }// end if else
         
      //int testAnswer = Integer.parseInt( num1 ) * Integer.parseInt( num2 ); used to check answer
      answer = prod[0] + prod[1] + prod[2] + prod[3];
      
      if( answer == 0 ){
         printSpace(3);
      }else if( num2.length() == 1 || num1.length() == 1 ){ //formats based on whether there are intermediate steps or not
        //no intermediate steps, no formatting required
      }else if( num2.length() == 2 || num1.length() == 2 ){
        System.out.println( "---------" );
        printSpace(2);
      }else if( num2.length() == 3 || num1.length() == 3){
        System.out.println( "---------" );
        printSpace(1);
      }else if( num2.length() == 4 || num1.length() == 4){
        System.out.println( "---------" );
        printSpace(0);
      }
      
      System.out.println( answer );
      //System.out.println( testAnswer ); used to check answer
                   
   }//end of main

}//end of class