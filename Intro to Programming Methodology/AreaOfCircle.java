import javax.swing.JOptionPane;

public class AreaOfCircle
{
   public static void main( String[] args )
   {        
      float radius; //initialize radius variable
      radius = Float.parseFloat(JOptionPane.showInputDialog ( null, "Enter radius of circle to calculate it's area." )); //take user input and assign it to float variable
      
      float area = AreaOfCircle.circleArea( radius );
      
      JOptionPane.showMessageDialog(null, "The area of a circle with radius of " + radius +  " units is " + area + " square units.", "Circle Area" , 0 ); //display dialog box with answer    
   }
   
   public static float circleArea( float x ) //method to calculate area
   {      
      float a = (float)( Math.PI * Math.pow( x, 2 ) ); // area = pi * r^2
      
      return a;
   }
}