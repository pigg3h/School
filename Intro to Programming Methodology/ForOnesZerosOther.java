public class ForOnesZerosOther
{

   public static void main( String[] args )
   {
   
      String OneZeroOther = "011A010B10011C0110D";
      
      int ones = 0;
      int zeros = 0;
      int other = 0;
      
      for( int i = 0; i < OneZeroOther.length(); i++ )
      {
      
         if( OneZeroOther.charAt(i) == '0' ){ zeros++; }
         else if( OneZeroOther.charAt(i) == '1'){ ones++; }
         else{ other++; }
         
      }
      
      System.out.println( "Zeros: " + zeros + "\nOnes: " + ones + "\nOther: " + other );
   
   }


}