/**
  Lab Number: 6
  Name: Richard Wright
  Description: Linked List class to link nodes of objects. Contains methods to move through the list, return objects in nodes, and add/remove nodes.
  Date: 10/18/16
*/
public class LinkedList {
   // Defined Node class
   private class Node {
   
      private Object Data = null;
      private Node Next = null;      
      
      public Node() { Data = null; Next = null; } //default constructor
      
      public Node(Object node) { Data = node; }
      public Node(Object o, Node n) { Data = o; Next = n; } //constructor      
      public void setNext(Node n) { Next = n; }
      public Node getNext() {  
         return Next; }
      public Object getElement() {  
         return Data; }
      public void setElement(Object node) { Data = node; }
   
   }

   // Internal data for LinkedList
   private Node head = null;
   private Node current = null;
   private int size = 0;
   
   // LinkedList constructor
   public LinkedList() {
      head = null;
      current = head;
   }
   
   // Move the current position forward one position
   // Pre-condition: Initialized list with x nodes, where x >= 0, and 'current' pointer pointing at one node
   // Post-condition: Initialized list with x nodes, where x >= 0, and 'current' pointer pointing at one node
   public void forward() {
   
      if(this.isEmpty() || this.size() == 1){ return; } //If the list is empty or only has one node, return
      
      Node tmp = current.getNext();
      if( tmp != null ){ current = tmp; }

   }
      
   // Move the current position backward one position
   // Pre-condition: Initialized list with x nodes, where x >= 0, and 'current' pointer pointing at one node
   // Post-condition: Initialized list with x nodes, where x >= 0, and 'current' pointer pointing at one node
   public void backward() {
   
      if(this.isEmpty() || this.size() == 1){ return; } //If the list is empty or only has one node, return
   
      Node tmp = head;
      
      while( tmp.getNext() != current && tmp.getNext() != null ){
      
         tmp = tmp.getNext();
      
      }
      
      current = tmp;

   }   
    
   // Get current object's data node
   public Object currentData() {
   
      if(current != null){
      
         return current.getElement();
      
      }
      else
      
      return null;
  
   }
  
  
   // Add object to the first of the list
   // Pre-condition: Initialized list with x >= 0 nodes and an object 'o' to be passed as parameter
   // Post-condition: Initialized list with x + 1 >= 0 nodes
   public void addFirst(Object o) {
   
      Node first = new Node(o, head); //new node with passed object as data and head as next
      head = first;                   //first becomes new head
      
      if(current == null){ current = head; } //If current isn't set (usually when the list was empty), set it
      
      size++;

   }
	
   
   // resetCurrent at the first position
   public void resetCurrent() {
   
      current = head;

   }
   
   // Add object to the last of the list
   // Pre-condition: Initialized list with x nodes, where x >=0, and an object 'o' to be passed as parameter
   // Post-condition: Initialized list with x + 1 nodes, where x >= 0
   public void addLast(Object o) {
   
      Node last = new Node(o, null); //new node with passed object as data, and null as next
      Node tmp = head;               //temporary node starting at head; used for traversing list
      
      if( head != null ){ //Traverse the list
      
         while( tmp.getNext() != null ){
         
            tmp = tmp.getNext();
         
         }
      
      }
      
      tmp.setNext(last); //When the end of the list is reached, set that node's next to new node
      
      size++;

   }
	
   // Add an object o before the current position
   // Pre-condition: Initialized list with x nodes, where x > 0, and 'current' pointer pointing to one node
   //                and an object 'o' to be passed as a parameter.
   // Post-condition: Initialized list with x + 1 nodes, where x > 0, and 'current' pointer pointing at one node. 
   public void insertBefore(Object o) {
   
      Node tmp = new Node(o, null); //new node with passed object as data, and null as next
      
      if(this.isEmpty()){ current = head = tmp; size++; return; } //if the list is empty, set new node as the head and point current to it
      ///else, if current is already pointing to the head, set new node's next to point to head, then reset head to the new node
      else if(current == head){ tmp.setNext( head ); head = tmp; size++; return; } 
      else
      
      tmp.setNext( current );
      
      this.backward();
      current.setNext( tmp );
      
      
      size++;

   }
   
   // Add an object o after the current position
   // Pre-condition: Initialized list with x nodes, where x > 0, and 'current' pointer pointing to one node
   //                and an object 'o' to be passed as a parameter.
   // Post-condition: Initialized list with x + 1 nodes, where x > 0, and 'current' pointer pointing at one node.
   public void insertAfter(Object o) {
   
      Node tmp = new Node(o, null); //new node with passed object as data and null as next
      
      if(this.isEmpty()){ this.addFirst(tmp); return; } //If the list is empty, pass the new node to the addFist method
      
      if(current != null){ //Check if current is pointing to a node
      
         //If the node current is pointing to is not the last node, set the new node's next to the next node in the list
         if(current.getNext() != null){ tmp.setNext(current.getNext()); } 
         
         //set current node's next to the new node
         current.setNext(tmp); }
      
      size++;

   }
   
   // Get first object
   // Pre-condition: An initialized list
   // Post-condition: An initialized list
   public Object getFirst() {
   
      Node empty = new Node();
      
      if( this.isEmpty() ){ return empty.getElement(); } //If the list is empty, return the node of a null constructed object
   
      return head.getElement();
     
   }
	
   // Get last object
   // Pre-condition: An initialized list
   // Post-condition: An initialized list
   public Object getLast() {
   
      Node traverse = new Node(); //new node used for traversing the list
      
      if(this.isEmpty()){ return traverse; } //If the list is empty, return the node of a null constructed object 
      
      traverse = head;
      
      //traverse the list
      if( head != null ){
      
         while( traverse.getNext() != null ){
         
            traverse = traverse.getNext();
         
         }
      
      }      
      
      return traverse.getElement(); //return the data of the last node

   }
	
   // Remove the first object
   public Object removeFirst(){
   
      Node removed = new Node(); //temporary, null constructed node
      
      //check if there is more than one node
      if(head.getNext() == null){
         
         //check if the list is empty, if it is, return null constructed node
         //if it isnt, assign the head to temporary, assign null to head and current, reduce list size by one, and return removed node
         if(this.isEmpty()){return removed;}
         else{
         
            removed = head;
            head = current = null;
            
            size--;
            
            return removed;
         
         }
         
      }
      else
      
      //if list has more than one node, assign head to removed, assign the next node to head, and set removed node's next to null
      //reduce list size by one, return removed node
      removed = head;
      head = head.getNext();      
      removed.setNext(null);
      
      size--;
      
      return removed;

   }
	
   // Remove the last object
   // Pre-condition: An intialized list with x nodes, where x >= 0
   // Post-condition: An initialized list with x - 1 nodes, where x - 1 >=0
   public Object removeLast() {
   
      Node removed = new Node(); //temporary, null constructed node  
      
      //if the list is empty, return null constructed node
      if(this.isEmpty()){ return removed;}
      //else, if the list has only one node, set the node's next to null, assign head to removed, and assign null to head and current
      //reduce size by one and return removed node
      else if(this.size() == 1){ 
         head.setNext(null);
         removed = head; 
         head = current = null;
         
         size--;
         
         return removed;
      }
      
      //if there is more than one node
      Node traverse = head; //node used for traversing
      Node prv = new Node(); //node used for tracking previous node to traverse node
      
      //traverse the list
      if( head != null ){
      
         while( traverse.getNext() != null ){
         
            prv = traverse; 
            traverse = traverse.getNext();
                  
         }
      
      }      
      
      //assign last node to removed node and set previous node's next to null
      //reduce list size by one and return removed node
      removed = traverse;      
      prv.setNext(null);
      
      size--;
      
      return removed;
      
   }
	
   // Remove object o from the list
   // Pre-condition: An initialized list with x nodes, where x > 0 and 'current' pointer pointing at one node
   // Post-condition: An initialized list with x - 1 nodes, where x - 1 >= 0, and 'current' pointer pointing at one node
   public void remove(Object o) {
   
      Node cur = head;
      Node prv = null; //node to keep track of node before object 'o'
      
      //move through the list until you reach object 'o'
      while( cur != null && cur.getElement() != o ){ 
      
         prv = cur; 
         cur = cur.getNext();
         
      }
      
      if( cur == null ){ return; } //if list is empty, return null
            
      Node nxt = cur.getNext(); //node to keep track of node after object 'o' 
      
      if( prv != null ){ prv.setNext(nxt); } //if removed object is not first node, set the previous node's next to node after removed node
      else { head = nxt; } //if it is the first node, set next node to head
      
      current = nxt; //set current to next node if removed object was not last node
      
      if( current == null && prv != null ){ current = prv; } //if it was last node, set current to previous node
      
      size--; //reduce size of list by one

   }
   
   // Returns the number of nodes on the list
   public int size() { return size; }
	
   // Is the list emptied?
   public boolean isEmpty() {
   
      if( size == 0 ){ return true; }
      else return false;

   }

   // Display a content of a list
   // Pre-condition: An initialized list with x nodes, where x >=0
   // Post-condition: An initialized list with x nodes, where x >= 0
   public String toString() {
      String r = "( HEAD -> ";
      // Node l = head.getNext();
      Node l = head;
      while (l != null) {
         r = r + l.getElement() + " -> " ;
         l = l.getNext();
      }
      return  r + " )";
   }
	
   public static void main(String args[]) {
      LinkedList lst = new LinkedList();
      // creat instances for testing
      CsusStudent instance1 = new CsusStudent("John Doe 1", 1, "1 Somewhere", "916-555-1211", "johndoe1@somewhere.com");
      CsusStudent instance2 = new CsusStudent("John Doe 2", 2, "2 Somewhere", "916-555-1212", "johndoe2@somewhere.com");
      CsusStudent instance3 = new CsusStudent("John Doe 3", 3, "3 Somewhere", "916-555-1213", "johndoe3@somewhere.com");
      CsusStudent instance4 = new CsusStudent("John Doe 4", 4, "4 Somewhere", "916-555-1214", "johndoe4@somewhere.com"); 
      CsusStudent instance5 = new CsusStudent("John Doe 5", 5, "5 Somewhere", "916-555-1215", "johndoe5@somewhere.com");
      CsusStudent instance6 = new CsusStudent("John Doe 6", 6, "6 Somewhere", "916-555-1216", "johndoe6@somewhere.com");
      CsusStudent instance7 = new CsusStudent("John Doe 7", 7, "7 Somewhere", "916-555-1217", "johndoe7@somewhere.com");
      CsusStudent instance8 = new CsusStudent("John Doe 8", 8, "8 Somewhere", "916-555-1218", "johndoe8@somewhere.com"); 
      CsusStudent instance9 = new CsusStudent("John Doe 9", 9, "9 Somewhere", "916-555-1219", "johndoe9@somewhere.com");         
     
      // begin adding instance1 to the list 
      lst.addFirst( instance1 );
      
      // test forward and backward for single entry
      lst.forward();
      lst.backward();
     
      
      // now add instance2 and instance3 via addFirst and instance4, instance5, instance6 via addLast
      lst.addFirst(instance2);
      lst.addFirst(instance3);
      
      lst.addLast(instance4);
      lst.addLast(instance5);
      lst.addLast(instance6);

      
      // move current forward a few times
      lst.forward();
      lst.forward();
      lst.forward();
   
      // insert instance 9 after
      lst.insertAfter(instance9);
      
      // remove instance9
      lst.remove(instance9);
      
      
      // print out the first and last entries
      System.out.println("Show the first entry and last entry:");
      System.out.println("First: \n" + lst.getFirst() );
      System.out.println("Last: \n" + lst.getLast() );
    
      
      // print out the whole list
      System.out.println("Show the whole list:");
      System.out.println( lst.toString() );

   	
      // remove entries starting from the last entry 
      System.out.println("Check for the content of the emptied list");
      
      while( lst.size() != 0 ){
      
         lst.removeLast();
      
      }
      
      System.out.println( lst.toString() );

   }
}