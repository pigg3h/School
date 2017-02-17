import javax.swing.JOptionPane;
import java.util.Random;

public class RockPaperScissorsLizardSpock
{

   public static void main( String[] args )
   {

   int userChoice;
   Object[] options = { "Rock", "Paper", "Scissors", "Lizard", "Spock", "Exit" };
   int r;
   int p;
   int sc;
   int l;
   int sp;
   Random ranGen = new Random();
   
   //int compChoice = 2;
   
   //System.out.println( compChoice );
   
   do{
   
   int compChoice = ranGen.nextInt( 5 );
   
   userChoice = JOptionPane.showOptionDialog( null, "Please Choose One:", 
                                             "Rock Paper Scissors Lizard Spock", JOptionPane.DEFAULT_OPTION, 3, null,
                                             options, 5 );
                                             
   switch( compChoice )
   {
   
      case 0: //Rock
         
         switch( userChoice )
         {
         
            case 0: //Rock
               JOptionPane.showMessageDialog( null, "Tie: Rock ties with Rock", "Computer: Rock, User: Rock", 1 );
               break;
               
            case 1://Paper
               JOptionPane.showMessageDialog( null, "Lose: Paper covers Rock", "Computer: Rock, User: Paper", 1 );
               break;
               
            case 2://Scissors
               JOptionPane.showMessageDialog( null, "Win: Rock breaks Scissors", "Computer: Rock, User: Scissors", 1 );
               break;
               
            case 3://Lizard
               JOptionPane.showMessageDialog( null, "Win: Rock crushes Lizard", "Computer: Rock, User: Lizard", 1 );
               break;
               
            case 4://Spock
               JOptionPane.showMessageDialog( null, "Lose: Spock vaporizes Rock", "Computer: Rock, User: Spock", 1 );
               break;
         
         } 
         break;
         
      case 1: //Paper
      
         switch( userChoice )
         {
         
            case 0: //Rock
               JOptionPane.showMessageDialog( null, "Lose: Paper covers Rock", "Computer: Paper, User: Rock", 1 );
               break;
               
            case 1://Paper
               JOptionPane.showMessageDialog( null, "Tie: Paper ties with Paper", "Computer: Paper, User: Paper", 1 );
               break;
               
            case 2://Scissors
               JOptionPane.showMessageDialog( null, "Lose: Scissors cuts Paper", "Computer: Paper, User: Scissors", 1 );
               break;
               
            case 3://Lizard
               JOptionPane.showMessageDialog( null, "Lose: Lizard eats Paper", "Computer: Paper, User: Lizard", 1 );
               break;
               
            case 4://Spock
               JOptionPane.showMessageDialog( null, "Win: Paper disproves Spock", "Computer: Paper, User: Spock", 1 );
               break;
         
         }
         break;
         
      case 2: //Scissors
         
         switch( userChoice )
         {
         
            case 0: //Rock
               JOptionPane.showMessageDialog( null, "Win: Rock breaks Scissors", "Computer: Scissors, User: Rock", 1 );
               break;
               
            case 1://Paper
               JOptionPane.showMessageDialog( null, "Lose: Scissors cuts Paper", "Computer: Scissors, User: Paper", 1 );
               break;
               
            case 2://Scissors
               JOptionPane.showMessageDialog(null,  "Tie: Scissors ties with Scissors", "Computer: Scissors, User: Scissors",1);
               break;
               
            case 3://Lizard
               JOptionPane.showMessageDialog(null,"Win: Scissors decapitates Lizard","Computer: Scissors, User: Lizard",1);
               break;
               
            case 4://Spock
               JOptionPane.showMessageDialog( null, "Lose: Spock smashes Scissors", "Computer: Scissors, User: Spock", 1 );
               break;
         
         }
         break;
         
      case 3: //Lizard
         
         switch( userChoice )
         {
         
            case 0: //Rock
               JOptionPane.showMessageDialog( null, "Win: Rock crushes Lizard", "Computer: Lizard, User: Rock", 1 );
               break;
               
            case 1://Paper
               JOptionPane.showMessageDialog( null, "Lose: Lizard eats Paper", "Computer: Lizard, User: Paper", 1 );
               break;
               
            case 2://Scissors
               JOptionPane.showMessageDialog(null,  "Win: Scissors decapitates Lizard", "Computer: Lizard, User: Scissors",1);
               break;
               
            case 3://Lizard
               JOptionPane.showMessageDialog( null, "Tie: Lizard ties with Lizard", "Computer: Lizard, User: Lizard", 1 );
               break;
               
            case 4://Spock
               JOptionPane.showMessageDialog( null, "Lose: Lizard poisons Spock", "Computer: Lizard, User: Spock", 1 );
               break;
         
         }
         break;
         
      case 4: //Spock
      
      switch( userChoice )
         {
         
            case 0: //Rock
               JOptionPane.showMessageDialog( null, "Lose: Spock vaporizes Rock", "Computer: Spock, User: Rock", 1 );
               break;
               
            case 1://Paper
               JOptionPane.showMessageDialog( null, "Win: Paper disproves Spock", "Computer: Spock, User: Paper", 1 );
               break;
               
            case 2://Scissors
               JOptionPane.showMessageDialog( null, "Lose: Spock smashes Scissors", "Computer: Spock, User: Scissors", 1 );
               break;
               
            case 3://Lizard
               JOptionPane.showMessageDialog( null, "Win: Lizard poisons Spock", "Computer: Spock, User: Lizard", 1 );
               break;
               
            case 4://Spock
               JOptionPane.showMessageDialog( null, "Tie: Spock ties with Spock", "Computer: Spock, User: Spock", 1 );
               break;
         
         }
         break;
   
   }
   
   }while( userChoice != 5 );

   }

}