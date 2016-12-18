public class DietLog
{

   private DietEntry[] dietLog;
   private int eol; //end of list
   
   public DietEntry get( int i )
   {
   
     DietEntry rv = null;
     
     if( i >= 0 && i <= eol )
     {
     
      rv = dietLog[i];
     
     }
     
      return rv;
        
   }

}