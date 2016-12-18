import java.util.Calendar;
public class Test{

   public static void main(String[] args){
   
      int A[] = {1, 2, 3};
      int B[] = new int[3];
      
      A = B;
      
      A[0] = -99;
      
      System.out.println( A[0] );
      System.out.println( B[0] );
   
      System.out.printf("%12d\n\n", 2016);
      
      String sMonth = "Mar";
      
      System.out.printf("%12s\n\n", sMonth);
   
      for(int i = 0; i <= 6; i++){
      
         switch(i){
            case 0: System.out.printf("%3s ", "S"); break;
            case 1: System.out.printf("%2s ", "M"); break;
            case 2: System.out.printf("%2s ", "Tu"); break;
            case 3: System.out.printf("%2s ", "W"); break;
            case 4: System.out.printf("%2s ", "Th"); break;
            case 5: System.out.printf("%2s ", "F"); break;
            case 6: System.out.printf("%2s ", "S"); break;
         }//end switch
      
      }//end for
      
      System.out.println();
      
      //System.out.println((JulianDate.toJulian(2016,9,1) + 1)%7);
      
      int firstDay = ((JulianDate.toJulian(2016,9,1)+ 1)%7) + 1;
      
      if((firstDay - 1) > 0){
         System.out.printf("%" + ((firstDay-1)*3) + "c",' ');
      }
      int currentDay = firstDay;
      int j = 1;
      
      while(j <= 30){
      
         System.out.printf( "%3d", j);
         
         if(currentDay == 7){
            System.out.println();
            currentDay = 0;
         }
         
         currentDay++;
         
         j++;
         
         }//end while
         
         System.out.println(Calendar.getInstance().get(Calendar.MONTH));
         
         //jd.toString(0);
      
      }
   
   }