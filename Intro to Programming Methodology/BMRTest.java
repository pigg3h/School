public class BMRTest
{
   public static void main( String[] args )
   {
   
      BMR helen = new BMR( "Helen", 150f, 74f, 22f, 'f', 4 );
      BMR larry = new BMR( "Big Larry", 300f, 78f, 26f, 'm', 2 );
      
      System.out.println( "Helen's BMR is " + helen.calcBMR() + " cal" );
      System.out.println( "Big Larry's BMR is " + larry.calcBMR() + " cal" );
   
   }
}