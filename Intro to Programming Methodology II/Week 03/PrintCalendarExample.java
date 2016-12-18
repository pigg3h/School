import java.util.Calendar;
public class PrintCalendar {
   private int year;
   private final JulianDate jd = new JulianDate();

public static void main(String[] args) {
   int inputYear;
   // Obtain input year integer value  
   // use Calendar.getInstance().get(Calendar.YEAR) to get current year
   // use Integer.parseInt(args[0]) to get input from command line input argurment
   // Create a calendar object
   PrintCalendar myCal = new PrintCalendar(inputYear); 
   // Print the calendar of the year i.e. myCal.printCal 
}
	
public PrintCalendar(int inputYear) {
   this.year = inputYear;
}
	
public void printCal() {
   // Label the year 
   // Repeat 12 times to print a month 
}
	
private void printMonth(int month) {
   // Label the input month i.e January    
   // Label Days of the week i.e S M Tu W Th F S
   // Print days numbers i.e. 1 2 3 ...
}

private void printDaysOfWeek() {	
   // print label days of the week i.e S M Tu W Th F S
}

private void printDayNumbers(int month) {
   // Determine number of days
   // Compute the 1st day of the month then position the 1st day for displaying
   // Repeat (number of days) times
   //     - Print a day
}
        
// Get number of days for a month        
//Method that returns the number of days for each month
private int getNumberOfDays (int month)   {
      int numberOfDays=0;
      //Switch statement that uses the month number to return the days for each month
      switch (month)
      {
         case 1: numberOfDays = 31;
            break;
         //Becuase February is sometimes 29 days, we have to call a seperate method for it
         case 2: numberOfDays = getFebruaryDays();
            break;
         case 3: numberOfDays = 31;
            break;
         case 4: numberOfDays = 30;
            break;
         case 5: numberOfDays = 31;
            break;
         case 6: numberOfDays = 30;
            break;
         case 7: numberOfDays = 31;
            break;
         case 8: numberOfDays = 31;
            break;
         case 9: numberOfDays = 30;
            break;
         case 10: numberOfDays = 31;
            break;
         case 11: numberOfDays = 30;
            break;
         case 12: numberOfDays = 31;
            break;
      }
      return numberOfDays;
}

        
private int getFebruaryDays() {
     	
}

} // End of PrintCalendar