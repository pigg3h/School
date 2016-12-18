public class Logbook
{

   private PilotLogbookEntry[] plb;
   private int eol;
   
   public Logbook()
   {
   
      plb = new PilotLogbookEntry[ 10000 ];
      eol = -1;
   
   }//end Logbook
   
   public void add( PilotLogbookEntry e )
   {
   
      if( eol < plb.length )
      {
      
      eol++; //advance end of list index
      plb[ eol ] = e;
      
      }
      else //list full
      {
      
         System.out.println( "Your logbook is full." );
      
      }
         
   }//end add
   
   public void displayList()
   {
   
      for( int i = 0; i <= eol; i++ )
      {
         
         System.out.println( "Entry #" + (i) + "\n" );
         System.out.println( plb[i] );
      
      }
   
   }//end displayList
   
   public int[] findID( String id )
   {
   
      
      int[] rv = new int[eol + 1];
      int ri = 0;
      
      for( int i = 0; i <= eol; i++ ){ rv[i] = -1; }
      
      for( int i = 0; i <= eol; i++ )
      {
      
         if( id.equals( plb[i].getIdNumber() ) )
         {
            rv[ri] = i;
            ri++;
         }
      
      }//end for
      
      return rv;
      
   }//end findID

}//end Logbook class