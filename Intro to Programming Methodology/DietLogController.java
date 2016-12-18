public class DietLogController
{
   
   private int eol; // End of list 
   private DietEntry[] dl; //diet log
   
   public DietLogController()
   {
   
      eol = 0;
      dl = new DietEntry[100];
      dl[eol] = new DietEntry();
      
   }
   public void add( DietEntry e )
   {
   
      if( eol < dl.length )
      {
      
         eol++;
         dl[eol] = new DietEntry();
         dl[eol-1] = e;
      
      }
      else
      {
         System.out.println( "Log full" );
      }
      
      return;
   
   }
   
   public DietEntry get( int i )
   {
   
     DietEntry rv = null;
     
     if( i < 0 || i == eol )
     {
     
        rv = dl[eol];
     
     }
     else
     {
        rv = dl[i];
     }
     
      return rv;
        
   }
   
   /* Search - Search for entries based on food/date/meal.
      Recursion? */

}