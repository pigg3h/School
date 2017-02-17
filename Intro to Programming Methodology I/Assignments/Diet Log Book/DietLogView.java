import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class DietLogView extends JFrame implements ActionListener, ChangeListener
{
  private JPanel center;
  private JPanel south;
  private JPanel west;
  private JTextField txtFood, txtCalories, txtDate, txtTime, txtMeal;
  
  private JButton bRight, bLeft, bAdd, bGet, bTotalCaloriesWindow;
  private JSlider scroll;
  
  private int currentRecord;
  
  private DietLog dietLog;
  
  public DietLogView( DietLog dl )  // pass in diet log to work with
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
    center.add( new JLabel( "Time", JLabel.RIGHT ) );
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
    
    bTotalCaloriesWindow = new JButton( "Calories by Date" );
    west.add( bTotalCaloriesWindow );
    bTotalCaloriesWindow.addActionListener( this );
    
    add( west, BorderLayout.WEST );

    // controls at bottom of display    
    south = new JPanel();
    south.setLayout( new GridLayout(1,3,2,2) );
    
    bLeft = new JButton("<");
    south.add( bLeft );
    bLeft.addActionListener( this );
    
    dietLog = dl; // parameter dl into field dietLog

    scroll = new JSlider( 1,dietLog.getEOL(),1 );
    south.add( scroll );
    scroll.addChangeListener( this );
    
    bRight = new JButton(">"); 
    south.add( bRight );   
    bRight.addActionListener( this );
    
    add( south, BorderLayout.SOUTH );
    
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    setBounds(200,200, 300,200);
    setVisible(true);
    
    currentRecord = 0;
    updateDisplay();
  }
  
  // update the display with the currentRecord
  private void updateDisplay()
  {
    DietEntry dle;
    // get data at currentRecord
    dle = dietLog.getEntry( currentRecord );
    
    // populate display with data
    txtFood.setText( dle.getFood() );
    txtCalories.setText( Integer.toString( dle.getCalories() ) );
    txtDate.setText( dle.getDate() );
    txtTime.setText( dle.getTime() );
    txtMeal.setText( dle.getMeal() );
    
  }
  
  // Controller for this project
  public void actionPerformed( ActionEvent ae )
  {
    if (ae.getSource() == bLeft )
    {
      if (currentRecord > 0)
      {
        currentRecord--;
      }
    }
    else if (ae.getSource() == bRight) // must be right button
    {
      if (currentRecord < dietLog.getEOL() )
      {
        currentRecord++;
      }
    }
    else if (ae.getSource() == bTotalCaloriesWindow)
    {
    
      TotalCaloriesView tcv = new TotalCaloriesView();
    
    }
    
    updateDisplay();
    scroll.setValue( currentRecord );
  }
  
  public void stateChanged( ChangeEvent ce )
  {
    currentRecord = scroll.getValue();  // for testing
    updateDisplay();
  }
  
  private class TotalCaloriesView extends JFrame implements ActionListener
  {
   
     private JTextField txtDate;
     private JButton bTotal;
     private JLabel lblTotalC;
   
     public TotalCaloriesView()
     {
   
        super("Total Calories by Date");
      
        setLayout( new GridLayout( 2,2, 4,4 ) );
      
        add( new JLabel( "Search Date" ) );
        txtDate = new JTextField( "mm/dd/yyyy" );
        add( txtDate );
      
        bTotal = new JButton( "Total Cal" );
        add( bTotal );
        bTotal.addActionListener( this );
      
        lblTotalC = new JLabel( "0", JLabel.RIGHT );
        add( lblTotalC );
      
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        setBounds(600,200, 400,100);
        setVisible(true);
   
      }
  
      public void actionPerformed( ActionEvent ae )
      {
      
         int total = dietLog.calByDate( txtDate.getText() );
                 
         lblTotalC.setText(Integer.toString(dietLog.calByDate( txtDate.getText() )));
         System.out.println( total );
         
         updateDisplay();         
              
      }
  }
  
  public static void main( String[] args )
  {
    DietLog diet = new DietLog();
    // add some dummy data for testing
    diet.add( new DietEntry("Burger", 340, "05/12/2016", "12 PM", "Lunch") );
    diet.add( new DietEntry("Broccoli", 34, "05/06/2016", "7 PM", "Dinner") );
    diet.add( new DietEntry() );
    diet.add( new DietEntry() ); 
    
    DietLogView dlv = new DietLogView( diet );
  }// end main
}//end DietLogView class