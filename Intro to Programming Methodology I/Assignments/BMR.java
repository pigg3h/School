public class BMR
{

   private String name;
   private float weight;
   private float height;
   private float age;
   private char gender;
   private int exLevel;
   
   public BMR ( String n, float w, float h, float a, char g, int e )
   {
   
      name = n;
      weight = w;
      height = h;
      age = a;
      gender = g;
      exLevel = e;
   
   }
   
   public float calcBMR()
   {
      float rv;
   
      if ( gender == 'f' )
      {
         rv = 655 + ( 4.35f * weight ) + ( 4.7f * height ) - ( 4.7f * age );
      }
      else // gender == 'm'
      {      
         rv = 66 + ( 6.23f * weight ) + ( 12.7f * height ) - ( 6.8f * age );    
      }
      
      
      switch( exLevel )
      {
      
      
         case 1:
            rv = rv * 1.2f;
            break;
         case 2:
            rv = rv * 1.375f;
            break;
         case 3:
            rv = rv * 1.55f;
            break;
         case 4:
            rv = rv * 1.725f;
            break;
         case 5:
            rv = rv * 1.9f;
            break; 
      
       
      }
      
      return rv;
      
      
   }
   
}