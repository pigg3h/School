import javax.swing.JOptionPane;

public class IfElseWeather
{

   public static void main( String[] args )
   {
   
      String sTemp;
      float t;
      int x = 0;
            
      do
      {
      
         sTemp = JOptionPane.showInputDialog( "What is the current temperature?" );
         t = Float.parseFloat( sTemp );
      
		   if( t < -25 || t > 125 )
		   {
		
			   JOptionPane.showMessageDialog( null, "Temperature is not suitable for human life. You shouldn't be alive.", "Error", 0 );
						
		    }else	if( t < 54 )
		    {
		
			   JOptionPane.showMessageDialog( null, "So it's " + t + " degrees out? Must be Winter.", "Winter", 1 );
            x = 1;
			   	
		    }else if( t < 69 )
		    {
		
			   JOptionPane.showMessageDialog( null, "So it's " + t + " degrees out? Must be Fall.", "Fall", 1 );
            x = 1;
				
		    }else if( t < 89 )
		    {
		
			   JOptionPane.showMessageDialog( null, "So it's " + t + " degrees out? Must be Spring.", "Spring", 1 );
            x = 1;
          
          }else if( t < 125 )
		    {
		
			   JOptionPane.showMessageDialog( null, "So it's " + t + " degrees out? Must be Summer.", "Summer", 1 );
            x = 1;
            
          }
                        
      }while( x == 0 ); //end do-while

   } //end main
   
} // end class