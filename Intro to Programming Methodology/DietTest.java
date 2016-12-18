public class DietTest
{

   public static void main(String[] args)
   {
   
      DietEntry diet1 = new DietEntry();
      DietEntry diet2 = new DietEntry( "Orange", 65, "05/28/1991", "08:00 PM", "Dinner" );
      DietEntry diet3 = new DietEntry( "Apple", 52, "04/12/2016", "07:00 AM" , "Breakfast" );
      
      System.out.println( diet1.toString() );
      System.out.println();      
      System.out.println( diet2.toString() );
      System.out.println();
      System.out.println( diet3.toString() );
      System.out.println();
      System.out.println( diet1.equals(diet2) );
      System.out.println( diet1.equals(diet3) );
      System.out.println( diet2.equals(diet3) );
      
      diet2.setFood( "Apple" );
      diet2.setCalories( 52 );
      
      System.out.println();
      System.out.println( diet1.toString() );
      System.out.println();      
      System.out.println( diet2.toString() );
      System.out.println();
      System.out.println( diet3.toString() );
      System.out.println();
      System.out.println( diet1.equals(diet2) );
      System.out.println( diet1.equals(diet3) );
      System.out.println( diet2.equals(diet3) );

      
      
   
   }//end main

}//end DietTest class