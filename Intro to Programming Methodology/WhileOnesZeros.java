public class WhileOnesZeros
{

   public static void main( String[] args )
   {
   
      String OneZero = "011010100110110";
      
      int cp = 0;
      int ones = 0;
      int zeros = 0;
      
      while( cp < OneZero.length() )
      {
      
         if( OneZero.charAt(cp) == '0' ){ zeros++; }
         else if( OneZero.charAt(cp) == '1'){ ones++; }
      
         cp++;
      }
      
      System.out.println( "Zeros: " + zeros + "\nOnes: " + ones );
   
   }


}