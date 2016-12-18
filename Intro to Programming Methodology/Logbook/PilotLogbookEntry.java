/*Richard Wright
Lab 4 - Pilot Logbook
CSCI 12 (40603)*/

public class PilotLogbookEntry
{

   private String date;          //date
   private String makeModel;     //make and model
   private String idNumber;      //aircraft ident
   private String from;          //start airport
   private String to;            //end airport
   private int landings;         //No. day landings
   private float hobbsTime;      //Hours hobbs meter time
   private float insHoodTime;    //hours instrument time using hood
   private float xCountryTime;   //hours cross country time
   private float pic;            //pilot in command
   private float solo;           //solo time
   private float groundTraining; //hours of ground training
   private float flightTraining; //hours of flight training
   private float totalFlightTime;//total flight time (should equal hobbs)   
   
   public PilotLogbookEntry( String d, String mm, String id, String f, String t,
                   int l, float ht, float iht, float xct, float p, float s, float gt,
                   float ft, float tft )
   {
   
      date = d;
      makeModel = mm;
      idNumber = id;
      from = f;
      to = t;
      landings = l;
      hobbsTime = ht;
      insHoodTime = iht;
      xCountryTime= xct;
      pic = p;
      solo = s;
      groundTraining = gt;
      flightTraining = ft;
      totalFlightTime = tft;   
   
   }
   
   //generic constructor here
   public PilotLogbookEntry()
   {
     
      date = "01/01/1900";
      makeModel = "ICON A-5";
      idNumber = "N0000Y";
      from = "SMF";
      to = "SFO";
      landings = 1;
      hobbsTime = 1.5f;
      insHoodTime = 0;
      xCountryTime= 0;
      pic = 1.5f;
      solo = 1.5f;
      groundTraining = 0;
      flightTraining = 0;
      totalFlightTime = 1.5f;
     
   }
   
   //Accessors
   public String getDate(){ return date; }
   public String getMakeModel(){ return makeModel; }
   public String getIdNumber(){ return idNumber; }
   public String getFrom(){ return from; }
   public String getTo(){ return to; }
   public int getLandings(){ return landings; }
   public float getHobbsTime(){ return hobbsTime; }
   public float getInsHoodTime(){ return insHoodTime; }
   public float getXCountryTime(){ return xCountryTime; }
   public float getPic(){ return pic; }
   public float getSolo(){ return solo; }
   public float getGroundTraining(){ return groundTraining; }
   public float getFlightTraining(){ return flightTraining; }
   public float getTotalFlightTime(){ return totalFlightTime; }
   
   public String toString()
   {
   
      return "Pilot's Logbook Entry details (Time in hours unless otherwise stated)\n\nDate: " + date + "\nMake/Model: " + makeModel + "\nID Number: " + idNumber +
             "\nFrom: " + from + "\nTo: " + to + "\nNumber of Day Landings: " + landings + "\nHobbs Time: " + hobbsTime +
             "\nInstr. Hood Time: " + insHoodTime + "\nCross Country Flight Time: " + xCountryTime + 
             "\nTime as Pilot in Command: " + pic + "\nSolo Flight Time: " + solo + "\nGround Training Time: " + groundTraining +
             "\nFlight Training Time: " + flightTraining + "\nTotal Flight Time: " + totalFlightTime + "\n\n";
                          
   
   }
   
   public boolean equals( Object obj )//define equals method (inherited from Object class)
   {
   
      PilotLogbookEntry ple = (PilotLogbookEntry) obj; //we can't directly pass an object, 
                                                       //so we have to cast it into our desired object
                                                       //Basically, creates a variable that points to the desired object
     
     return idNumber.equals(ple.idNumber);
      
     /*return date.equals(ple.date) &&
      idNumber.equals(ple.idNumber) &&
      (totalFlightTime == ple.totalFlightTime);*/
      //this works in this case, but generally better to use code below
      
      /*Math.abs( totalFlightTime - ple.totalFlightTime) <= .0001f;
      
      subtract the two variables, take the absolute value and make 
      sure the difference is small enough. good for computed values*/
   
   }
   
   public static void main( String[] args ) //test code
   {
   
     PilotLogbookEntry ple1 = new PilotLogbookEntry(); 
     PilotLogbookEntry ple2 = new PilotLogbookEntry( "04/07/2016", "Mustang P-51D", "N1234Z", "LCY", "LCY", 1, 3.5f, 0f, 3.5f, 3.5f, 3.5f, 0f, 0f, 3.5f );
      
      System.out.println( ple1 );
      System.out.println( ple2 );
      
      System.out.println( "Equals? " + ple1.equals( ple2 ) );//Equals method (call with one object and pass another object into it)
   
   }

}