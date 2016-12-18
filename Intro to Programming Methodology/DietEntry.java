public class DietEntry
{

   private String food;  //name of food
   private int calories; //calories this serving
   private String date;          //mm/dd/yy
   private String time;          //hh:mm
   private String meal;          //meal food was consumed (I think Breakfast/Lunch/Dinner is meant)
   
   public DietEntry()
   {
   
      food = "Not Found";
      calories = 0;
      date = "";
      time = "";
      meal = "";
   
   }//end generic DietEntry constructor
   
   public DietEntry( String f, int c, String d, String t, String m )
   {
   
      food = f;
      calories = c;
      date = d;
      time = t;
      meal = m;
   
   }//end DietEntry constructor
   
   //accessors
   public String getFood(){ return food; }
   public int getCalories(){ return calories; }
   public String getDate(){ return date; }
   public String getTime(){ return time; }
   public String getMeal(){ return meal; }
   
   //mutators
   public void setFood( String mf ){ food = mf; }
   public void setCalories( int mc ){ calories = mc; }
   public void setDate( String md ){ date = md; }
   public void setTime( String mt ){ time = mt; }
   public void setMeal( String mm ){ meal = mm; }
   
   public String toString()
   {
   
     return "Diet Log Entry\nFood: " + food + "\nCalories: " + calories + "\nDate: " + date 
            + "\nTime: " + time + "\nMeal: " + meal;
   
   }//end toString
   
   public boolean equals( Object o )
   {
   
      DietEntry de = (DietEntry) o;
      
      return getFood() == de.getFood() && getCalories() == de.getCalories();
   
   }//end equals

}//end DietEntryClass