import javax.swing.JOptionPane;

public class IfElseFun
{

   public static void main( String[] args )
   {
   
      String sentence;
      int x = 0;
      
      do
      {
         sentence = JOptionPane.showInputDialog( "Please enter a sentence:" );
      
         if( sentence.endsWith( "." ) )
         {
      
            JOptionPane.showMessageDialog( null, "Your sentence is a DECLARATIVE sentence.", "Declarative", 1 );
            x = 1;
      
         }else if( sentence.endsWith( "?" ) )
         {
      
            JOptionPane.showMessageDialog( null, "Your sentence is an INTERROGATIVE sentence.", "Interrogative", 1 );
            x = 1;
                   
         }else if( sentence.endsWith( "!" ) )
         {
      
            JOptionPane.showMessageDialog( null, "Your sentence is an EXCLAMATORY sentence.", "Exclamatory", 1 );
            x = 1;
      
         }else
         
          JOptionPane.showMessageDialog( null, "Sentence not recognized.", "ERROR", 0 );
                   
      }while( x == 0 );
   }

}