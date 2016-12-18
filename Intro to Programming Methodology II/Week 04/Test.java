import java.util.Arrays;

public class Test{

   public static void main(String[] args){
   
      double[] testArray = new double[5];
      
      for(int i = 0; i < 5; i++){
      
         testArray[i] = Math.random() * 10;
         System.out.println(testArray[i]);
      
      }
      
      System.out.println("Java " + 1 + 2 + 3);      
      
      Arrays.sort(testArray);
      
      for(int i = 0; i < 5; i++){
      
         //testArray[i] = Math.random() * 10;
         System.out.println(testArray[i]);
      
      }
      
      
   
   }

}