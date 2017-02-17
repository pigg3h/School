public class LogbookTest
{

   public static void main( String[] args )
   {
   
      Logbook lb = new Logbook();
      PilotLogbookEntry ple1 = new PilotLogbookEntry();
      PilotLogbookEntry ple2 = new PilotLogbookEntry();
      PilotLogbookEntry ple3 = new PilotLogbookEntry();
      PilotLogbookEntry ple4 = new PilotLogbookEntry();
      
      lb.add( ple1 );
      lb.add( ple2 );
      lb.add( ple3 );
      lb.add( ple4 );

      lb.displayList();
      
      
      System.out.println( lb.findID( "N0000Y" ) ); //Prints the array location in memory, need it to print the contents...
   
   }//end main

}