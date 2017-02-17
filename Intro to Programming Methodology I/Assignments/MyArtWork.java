//Reproduction of "Composition No. 10" by Piet Mondriaan - http://www.wikiart.org/en/piet-mondrian/composition-no-10-1942
import java.awt.*;


public class MyArtWork implements Drawable
{

   public void draw( Graphics g )
   {
      //vertical lines
      g.fillRect( 50, 0, 15, 800 );
      g.fillRect( 175, 0, 15, 800 );
      g.fillRect( 600, 0, 15, 800 );
      g.fillRect( 690, 0, 15, 800 );
      g.fillRect( 755, 0, 15, 800 );
      
      //horizontal lines
      g.fillRect( 190, 10, 425, 10 );
      g.fillRect( 0, 165, 50, 35 );
      g.fillRect( 190, 180, 425, 20 );
      g.fillRect( 0, 260, 800, 15 );
      g.fillRect( 0, 440, 800, 15 );
      g.fillRect( 65, 490, 625, 10 );
      g.fillRect( 0, 530, 800, 15 );
      g.fillRect( 175, 735, 580, 10 );
      
      //colors
      Color b = new Color( 88, 130, 230 ); //blue
      g.setColor( b );
      g.fillRect( 0, 0, 50, 165 );
      
      Color y = new Color( 255, 255, 1 ); //yellow
      g.setColor( y );
      g.fillRect( 0, 455, 50, 75 );
      g.fillRect( 615, 745, 75, 20 );
      g.fillRect( 705, 745, 50, 20 );
      
      Color r = new Color( 217, 15, 5 ); //red
      g.setColor( r );
      g.fillRect( 0, 580, 50, 50 );
      g.fillRect( 405, 745, 35, 20 );
      g.fillRect( 770, 275, 50, 165 );      
   
   }
   
   public static void main( String[] args )
   {
   
      GraphicsFrame gf = new GraphicsFrame();
      MyArtWork maw = new MyArtWork();
      
      gf.add( maw );
   
   }

}