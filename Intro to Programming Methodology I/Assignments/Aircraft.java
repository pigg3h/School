import java.awt.*;

public class Aircraft implements Drawable
{

   String mfg;
   float span;
   float chord;
   float length;
   float emptyWeight;
   float grossWeight; //Gross takeoff weight
   private int x,y; //location of aircraft
   
   public Aircraft( String m, float s, float c, 
                    float len, float w, float gw,
                    int cx, int cy  )
   {
   
      mfg = m;
      span = s;
      chord = c;
      length = len;
      emptyWeight = w;
      grossWeight = gw;
      x = cx;
      y = cy;
         
   } //end constructor
   
   //accessors
   public String getMfg(){ return mfg; }
   public float getSpan(){ return span; }
   public float getChord(){ return chord; }
   public float getLength(){ return length; }
   public float getEW(){ return emptyWeight; }
   public float getGW(){ return grossWeight; }
   
   //mutators
   public void setEmptyWeight( float w ){ emptyWeight = w; }
   public void setGrossWeight( float w ){ grossWeight = w; }
   
   public void draw ( Graphics g ) //be warned, I am not an artist
   {
      
      Color black = new Color( 0, 0, 0 );  
      Color navyBlue = new Color ( 0, 0, 128 );
      Color red = new Color( 255, 0, 0 );
      Color silver = new Color( 192, 192, 192 );
      Color blue = new Color( 0, 0, 255 );
      Color brown = new Color( 181, 101, 29 );
      Color white = new Color( 255, 255, 255 );
      
      g.setColor( red );
      g.drawString( "RED TAILS", 50, 50 );
           
      g.setColor( silver );
      g.fillRect( x + 150, y - 160, 60, 400 );
      g.setColor( white );
      g.fillRect( x + 165, y - 140, 10, 80);
      g.fillRect( x + 180, y - 140, 10, 80);
      g.setColor( navyBlue );
      g.fillOval( x + 157, y - 118, 40, 40 );
      g.setColor( white );
      g.fillRect( x + 165, y + 130, 10, 80);
      g.fillRect( x + 180, y + 130, 10, 80);
      g.setColor( navyBlue );
      g.fillOval( x + 157, y + 150, 40, 40 );
      g.setColor( black );
      g.drawRect( x + 150, y - 160, 60, 400);
      g.drawRect( x + 340, y - 25, 50, 115 );
      
      g.setColor( silver );
      g.fillOval( x, y, 400, 60 );
      g.setColor( red );
      g.fillRect( x + 340, y - 25, 50, 115 );
      g.fillOval( x + 360, y + 20, 40, 15 );
      g.fillOval( x + 360, y + 25, 40, 15 );
      g.setColor( black );
      g.drawOval( x, y, 400, 60);
      
      g.setColor( silver );
      g.fillRect( x + 5, y, 200, 60 );
      g.setColor( black );
      g.drawLine( x + 5, y, x + 205, y );
      g.drawLine( x + 5, y + 60, x + 205, y + 60 );
      
      g.setColor( blue );
      g.fillOval( x + 125, y + 10, 75, 35 );
      
      g.setColor( brown );
      g.fillOval( x - 15, y + 24, 10, 100 );
      g.fillOval( x - 15, y - 65, 10, 100 );
      g.setColor( black );
      g.drawOval( x - 15, y + 24, 10, 100 );
      g.drawOval( x - 15, y - 65, 10, 100 );
      
      g.setColor( red );
      g.fillOval( x - 15, y + 24, 50, 10 );
      g.setColor( black );
      g.drawOval( x - 15, y + 24, 50, 10);
      
      g.setColor( red );
      g.fillRoundRect( x, y - 1, 50, 62, 10, 10 );
      g.setColor( black );
      g.drawRoundRect( x, y - 1, 50, 62, 10, 10 );
      
      g.setColor( red );
      g.fillOval( x + 335, y + 25, 60, 10 );
      g.setColor( black );
      g.drawOval( x + 335, y + 25, 60, 10 );
      
      g.setColor( red );
      g.fillRect( x + 150, y - 40, 60, 30 );
      g.fillRect( x + 150, y + 70, 60, 30 );
   
   }
   
     
   //general methods
   public float weightMargin()
   {
    
      return grossWeight - emptyWeight;
   
   }
   
   public float wingArea()
   {
         
      return span * chord;
   
   }
   
   public String toString()
   {
   
      return mfg + "\nSpan: " + span + " ft. \rChord: " + chord + " ft. \rLength: " +
             length + " ft. \rEmpty Weight: " + emptyWeight + " lbs. \rGross Weight: " + grossWeight + " lbs.";
   
   }

   public static void main( String[] args )
   {
   
      Aircraft P51D = new Aircraft( "North American Aviation", 37, 235/37f, 32.25f, 7635, 12100, 200, 200 );
      Aircraft P51D2 = new Aircraft( "North American Aviation", 37, 235/37f, 32.25f, 7635, 12100, 200, 650 );
      Aircraft P51D3 = new Aircraft( "North American Aviation", 37, 235/37f, 32.25f, 7635, 12100, 500, 400 );
      
      System.out.println( P51D );
      System.out.println ("The P51-D has a wing area of " + P51D.wingArea() + " sq. ft." );
      System.out.println ("The P51-D has a weight margin of " + P51D.weightMargin() + " lbs." );
      
      GraphicsFrame gf = new GraphicsFrame();      
      gf.add( P51D );
      gf.add( P51D2 );
      gf.add( P51D3 );
      
   }

}// end Aircraft class