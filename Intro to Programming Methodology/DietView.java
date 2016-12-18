import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DietView extends JFrame
{
  private JPanel center;
  private JPanel south;
  private JPanel west;
  private JTextField txtFood, txtCalories, txtDate, txtTime, txtMeal;
  
  private JButton bRight, bLeft, bAdd, bGet, bSearch;
  private JSlider scroll;
  
  public DietView()
  {
    super("Diet Log");
    setLayout( new BorderLayout() );
    
    center = new JPanel();
    center.setLayout( new GridLayout(5,2,2,2) );
    
    txtFood = new JTextField( 20 );
    center.add( new JLabel( "Food", JLabel.RIGHT ) );
    center.add( txtFood );
    
    txtCalories = new JTextField( 20 );
    center.add( new JLabel( "Calories", JLabel.RIGHT ) );
    center.add( txtCalories );
        
    txtDate = new JTextField( 20 );
    center.add( new JLabel( "Date", JLabel.RIGHT ) );
    center.add( txtDate );
    
    txtTime = new JTextField( 20 );
    center.add( new JLabel( "Time", JLabel.RIGHT) );
    center.add( txtTime );
    
    txtMeal = new JTextField( 20 );
    center.add( new JLabel( "Meal", JLabel.RIGHT ) );
    center.add( txtMeal );   
    
    add( center, BorderLayout.CENTER );
    
    /*Following buttons (Add, Get, Search) are non-functional
      currently. Functionality to be added later.*/
    west = new JPanel();
    west.setLayout( new GridLayout(0, 1) );
    
    bAdd = new JButton("Add Entry");
    west.add( bAdd );
    
    bGet = new JButton("Get Entry");
    west.add( bGet );
    
    bSearch = new JButton( "Find Entry" );
    west.add( bSearch );
    
    add( west, BorderLayout.WEST );

    // controls at bottom of display    
    south = new JPanel();
    south.setLayout( new GridLayout(1,3,2,2) );

    
    bLeft = new JButton("<");
    south.add( bLeft );
    
    scroll = new JSlider( 1,100,1 );
    south.add( scroll );
    
    bRight = new JButton(">"); 
    south.add( bRight );   
    
    add( south, BorderLayout.SOUTH );
    
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    setBounds(200,200, 300,300);
    setVisible(true);
    
    currentRecord = 0;
    dietLog = dl;
  }
  
  public static void main( String[] args )
  {
    DietView dlv = new DietView();
  }
}