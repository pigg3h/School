public class Orbit{

   private final float G = 6.67E-11f; //N * ( m^2 / kg^2 )
   private float M; //kg
   private float R; //m
   
   public Orbit( float m, float r ){
   
      M = m;
      R = r;
   
   }
   
   public float vEscape()
   {
      return (float)Math.sqrt( 2*((G*M)/R) );
   }
   
   public float vEscape( float mass )
   {
      return (float)Math.sqrt( 2*((G*mass)/R) );
   }

   


}