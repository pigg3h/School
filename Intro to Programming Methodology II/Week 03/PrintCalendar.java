//////////////////////////////////////////////////////////////////////////////////////////
// Lab number: 3                                                                        //
// Name: Richard Wright                                                                 //
// Module Description: Print Calendar                                                   //
// Date: 09/21/16                                                                       //
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.Calendar;

public class PrintCalendar{

   private int year;
   private final JulianDate jd = new JulianDate();
   
   public static void main(String[] args){     
    
      int inputYear;
      
      PrintCalendar myCal = new PrintCalendar();
     
      //Checks if user run an argument, else current year is used.
      if(args.length == 0){
         myCal.setYear(Calendar.getInstance().get(Calendar.YEAR));
      }else{
         myCal.setYear(Integer.parseInt(args[0]));
      }
      
      System.out.println("\n");
      
      myCal.printCal();
   
   }//end main

   //Sets the inputted year to the year variable used by PrintCalendar
   public void setYear(int inputYear){ 
   
      this.year = inputYear;
      
   }//end setYear
   
   //Prints the calendar, and if the year printed is the current year, highlights the current month
   public void printCal(){
   
      System.out.printf("%11d\n\n", year );
      
      for(int i=1; i<=12; i++){
      
         if(Calendar.getInstance().get(Calendar.YEAR) == this.year && (Calendar.getInstance().get(Calendar.MONTH)) + 1 == i){
            System.out.print("------------------------\n");
         }
      
         printMonth(i);
         
         if(Calendar.getInstance().get(Calendar.YEAR) == this.year && (Calendar.getInstance().get(Calendar.MONTH)) + 1 == i){
            System.out.println("\n");
            System.out.print("------------------------\n");
         }else{
            System.out.print("\n\n");
         }

      
      }//end for
   
   }//end printCal
   
   //Method to label months with correct month name (eg month 1 = January)
   private void printMonth(int month){
      
      String sMonth = "";
      
      switch(month){
         case 1: sMonth = "Jan"; break;
         case 2: sMonth = "Feb"; break;
         case 3: sMonth = "Mar"; break;
         case 4: sMonth = "Apr"; break;
         case 5: sMonth = "May"; break;
         case 6: sMonth = "Jun"; break;
         case 7: sMonth = "Jul"; break;
         case 8: sMonth = "Aug"; break;
         case 9: sMonth = "Sep"; break;
         case 10: sMonth = "Oct"; break;
         case 11: sMonth = "Nov"; break;
         case 12: sMonth = "Dec"; break;
      }//end switch
            
      System.out.printf("%10s\n\n", sMonth);
      
      this.printDaysOfWeek();
      
      this.printDayNumbers(month);
                  
   }//end printMonth
   
   //Method to label days of week (Su, M, T, etc)
   private void printDaysOfWeek(){
   
      for(int i = 0; i <= 6; i++){
      
         switch(i){
            case 0: System.out.printf("%3s ", "Su"); break;
            case 1: System.out.printf("%2s ", "M"); break;
            case 2: System.out.printf("%2s ", "Tu"); break;
            case 3: System.out.printf("%2s ", "W"); break;
            case 4: System.out.printf("%2s ", "Th"); break;
            case 5: System.out.printf("%2s ", "F"); break;
            case 6: System.out.printf("%2s \n", "Sa"); break;
         }//end switch
      
      }//end for      
   
   }//end printDaysOfWeek
   
   //Method to number months
   private void printDayNumbers(int month){
   
      int numberOfDays = getNumberOfDays(month); //get number of days in month
      
      //Function to determine what day of the week the first of the month falls on (eg. 0 is Sunday, 1 is Monday, etc)
      int firstDay = ((jd.toJulian(year, month, 1) + 1) % 7) + 1;
      
      //From result of above function, formats so the first day is under the correct day of the week
      if((firstDay - 1) > 0){
         System.out.printf("%" + ((firstDay-1)*3) + "c", ' ');
      }
      
      //While loop to number the days of the week
      int currentDay = firstDay;
      int j = 1;
      
      while(j <= numberOfDays){
         
         System.out.printf( "%3d", j);
         
         /*if currentDay is 7, makes a new line and resets currentDay value to 0
           This formats the numbers to drop to a new week when they reach end of current week*/
         if(currentDay == 7){
            System.out.println();
            currentDay = 0;
         }
         
         currentDay++;
         j++;
         
      }//end while
   
   }//end printDayNumbers
   
   //Hard coded number of days in each month (except Feburary). Passed an integer 1-12 and returns number for resulting month.
   private int getNumberOfDays(int month){
   
      int numberOfDays = 0;
   
      switch(month){
         case 1: numberOfDays = 31; break;
         case 2: numberOfDays = this.getFebDays(); break;
         case 3: numberOfDays = 31; break;
         case 4: numberOfDays = 30; break;
         case 5: numberOfDays = 31; break;
         case 6: numberOfDays = 30; break;
         case 7: numberOfDays = 31; break;
         case 8: numberOfDays = 31; break;
         case 9: numberOfDays = 30; break;
         case 10: numberOfDays = 31; break;
         case 11: numberOfDays = 30; break;
         case 12: numberOfDays = 31; break;
      }//end switch
      
      return numberOfDays;
   
   }//end getNumberOfDays
   
   //Returns correct days in Feburary, depending on if its a leap year or not
   private int getFebDays(){
   
      int n = 28; //default, non-leap year days
   
      //function to determine if its a leap year. If it is, increase n to 29 (29 days in Feb if leap year)
      if(this.year % 4 == 0 && (this.year % 100 != 0 || this.year % 400 == 0)){
         n++;      
      }
      
      return n;
   
   }//end getFebDays
   
}//end PrintCalendar class