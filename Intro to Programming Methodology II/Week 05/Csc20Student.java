/**
  Lab Number: 5
  Name: Richard Wright
  Description: Csc20Student Class, extension of CsusStudent class
  Date: 10/04/16
*/
public class Csc20Student extends CsusStudent {

   // attributes
   private boolean preComputerMajor;
   private int numberOfComputerClassUnits;
      
   // constructor   
   public Csc20Student(String name, int id, String address, String phone, String email, boolean preCsMajor, int csUnits) {
       
      super(name, id, address, phone, email); //pass name, address, phone, and email parameters to the CsusStudent class constructor
      
      preComputerMajor = preCsMajor;      
      numberOfComputerClassUnits = csUnits;
 
   }
   
   // getPreComputerMajor 
   public boolean getPreComputerMajor() {
   
      return preComputerMajor;
 
   }
    
   // setPreComputerMajor
   public void setPreComputerMajor(boolean value) {
   
      preComputerMajor = value;
 
   }

   // getNumberofCsUnits
   public int getNumberofCsUnits() {
   
      return numberOfComputerClassUnits;
 
   }
    
   // setNumberofCsUnits
   public void setNumberOfCsUnits(int units) {
   
      numberOfComputerClassUnits = units;
 
   }

   // toSTring
   public String toString(){
      
      // return a string value by combining all values from class's attributes
      return super.toString() + "Pre-Computer Science?: " + preComputerMajor 
             + "\nNumber of Completed Computer Science Units: " + numberOfComputerClassUnits;
                  
   }

}