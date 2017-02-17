//Reproduction of "Composition No. 10" by Piet Mondriaan - http://www.wikiart.org/en/piet-mondrian/composition-no-10-1942
import java.awt.*;


public class TestP51 implements Drawable
{

   public void draw( Graphics g )
   {
           
   
   }
   
   public static void main( String[] args )
   {
   
      GraphicsFrame gf = new GraphicsFrame();
      MyArtWork maw = new MyArtWork();
      
      gf.add( maw );
   
   }

}