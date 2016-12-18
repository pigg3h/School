public class DietLog
{
  private int eol; // end of list
  private DietEntry[] dl; // diet log
  
  public DietLog()
  {
  
    eol = -1;
    dl = new DietEntry[100];    
 
  }
  
  public int getEOL(){ return eol; }
  
  public void add( DietEntry e )
  {
    if ( eol < dl.length )
    {
      eol++;  // advance end of list index
      dl[ eol ] = e;
    }
    else // list is full
    {
      System.out.println( "Diet log is full" );
    }
  }

  
  public DietEntry getEntry( int i )
  {
    DietEntry rv = null;
    
    if ( i >= 0 && i <= eol )
    {
      rv = dl[ i ];
    }
    
    return rv;
  }


  public void displayList()
  {
    for( int i=0; i <= eol; i++ )
    {
      System.out.println( dl[ i ] );
    }
  }
  
  public int calByDate( String d )
  {
  
     int total = 0;
     String td;
     
     for( int i=0; i <= eol; i++ )
     {
       td = dl[i].getDate();
     
       if (td.equals( d ))
       {
       
         total = total + dl[i].getCalories();
       
       }
     
     }
     
     return total;
  
  }
  
  public static void main(String[] args)
  {
    DietLog diet = new DietLog();
    diet.add( new DietEntry("Blah", 340, null, null, null) );
    diet.add( new DietEntry() );
    diet.add( new DietEntry() );
    diet.add( new DietEntry() );    
   
    diet.displayList();
  }

}