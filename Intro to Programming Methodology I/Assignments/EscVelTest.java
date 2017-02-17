public class EscVelTest{

   public static void main( String[] args ){
   
      Orbit mikesWorld = new Orbit( 8.2E15f, 10000f );
      Orbit mars = new Orbit( 6.39E23f, 3.39E6f );
      Orbit moon = new Orbit( 7.34E22f, 1.737E6f );
      
      System.out.println( mikesWorld.vEscape() + " meters per second." );
      
      System.out.println(mars.vEscape() + " meters pers second." );
      System.out.println(moon.vEscape() + " meters pers second." );
      
      System.out.println( mikesWorld.vEscape( 8.2E14f ) + " meters per second." );
   
   }

}