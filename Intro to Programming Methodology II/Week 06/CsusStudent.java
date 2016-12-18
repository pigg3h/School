/**
  Lab Number: 6
  Name: Richard Wright
  Description: CsusStudent Class
  Date: 10/18/16
*/
public class CsusStudent {
   // class attributes
   private String studentName;
   private int studentId;
   private String studentAddress;
   private String studentPhone;
   private String studentEmail;

   // constructor
   public CsusStudent(String newName, int newId, String newAddress, String newPhone, String newEmail){
   
      studentName = newName;
      studentId = newId;
      studentAddress = newAddress;
      studentPhone = newPhone;
      studentEmail = newEmail;

   }

   // setName
   public void setName(String newName){
    
      studentName = newName;
      
   }

   // getName 
   public String getName(){
    
      return studentName;

   }
    
   // setID
   public void setID(int newID){
    
      studentId = newID;

   }

   // getID 
   public int getID(){
    
      return studentId;

   }  

   // setAddress
   public void setAddress(String newAddress){
    
      studentAddress = newAddress;

   }

   // getAddress
   public String getAddress(){
   
      return studentAddress;

   }

   // setPhone
   public void setPhone(String newPhone){
   
      studentPhone = newPhone;
      
   }
 
   // getPhone
   public String getPhone(){
   
      return studentPhone;

   }

   // setEmail
   public void setEmail(String newEmail){
   
      studentEmail = newEmail;

   }

   // getEmail
   public String getEmail(){
   
      return studentEmail;

   }

   // toString
   public String toString(){
      
      // return a string value by combining all values from class's attributes (Name, ID, Address, Phone, Email)
      return "CSUS Student\nName: " + studentName + "\nStudent ID: "
             + studentId + "\nAddress: " + studentAddress + "\nPhone Number: "
             + studentPhone + "\nEmail: " + studentEmail + "\n";

   }

}