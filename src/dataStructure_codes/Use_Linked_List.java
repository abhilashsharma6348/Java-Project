package dataStructure_codes;

public class Use_Linked_List {

/* Main function of the class for the testing purpose of the various functions of the LinkedList */
  public static void main(String[]args) {
	  Linked_List lst = new Linked_List();
	  Linked_List.Node nd1 = new Linked_List().new Node();
	  lst.head = nd1;
	  nd1.data = 23;
	  Linked_List.Node nd2 = new Linked_List().new Node();
	  nd1.ptr = nd2;
	  nd2.data = 30;
	  Linked_List.Node nd3 = new Linked_List().new Node();
	  nd2.ptr = nd3;
	  nd3.data = 50;
	  nd3.ptr = null;
	  print(lst);
//	  
//	  System.out.println("After inserting an element in the linked list");
//	  Linked_List lst1 = insert(lst,44,4);
//	  print(lst1);
//	  System.out.println("After deleting an element from a linked list");
//	  Linked_List lst2 = delete(lst, 78);
//	  print(lst2);
	  
	  /* creating a second linkedList */
	  Linked_List lst21 = new Linked_List();
	  Linked_List.Node nd21 = new Linked_List().new Node();
	  lst21.head = nd21;
	  nd21.data = 32;
	  Linked_List.Node nd22 = new Linked_List().new Node();
	  nd21.ptr = nd22;
	  nd22.data = 37;
	  Linked_List.Node nd23 = new Linked_List().new Node();
	  nd22.ptr = nd23;
	  nd23.data = 44;
	  nd23.ptr = null;
	
//	  print(lst21);
	  
//	  Linked_List lst_main = insertintosorted(lst21, 40);
//	  System.out.println("Printing the elements after inserting into sorted array");
//	  print(lst_main);
	  
	  System.out.println("After merging a list in the sorted manner");
	  Linked_List lst45 = mergesortedlinkedlist(lst,lst21);
	  print(lst45);
	  
  // calling mergesorted linkedList function
//   Linked_List lst12 = mergesortedlinkedlist(lst, lst21);
//	  print(lst12);
  }
  
//  method for printing the elements of the LinkedList
	  
  public static void print(Linked_List lst) {
	  Linked_List.Node ptr1 = lst.head;
	  while(ptr1!=null) {
		  System.out.println(ptr1.data);
		  ptr1 = ptr1.ptr;
	  }
  }
  
//  method for inserting a node in the LinkedList at a specified position
  public static Linked_List insert(Linked_List lst, int data, int pos) {
	  Linked_List.Node ptr1 = lst.head;
	  Linked_List.Node ptr2 = null;
	  int i =1;
	  while(i != pos-1) {
		  i++;
		  ptr1 = ptr1.ptr;
	  }
	  ptr2 = ptr1.ptr;
	  Linked_List.Node ptr3 = new Linked_List().new Node();
	  ptr3.data = data;
	  ptr3.ptr = ptr2;
	  ptr1.ptr = ptr3;
	  return lst;
  }

// method for deleting a node in a linkedList 
  public static Linked_List delete(Linked_List lst, int data) {
	  Linked_List.Node ptr1 = lst.head;
	  Linked_List.Node prev = null;
	  while(ptr1 != null && ptr1.data != data) {
		  prev = ptr1;
		  ptr1 = ptr1.ptr;
	  }
	  try {
	  	prev.ptr = ptr1.ptr;
	  }
	  catch(NullPointerException e1) {
		  System.out.println("Element Not found in the list");
	  }
	  return lst;
  }

// method for merging a 2 sorting linkedList in a sorted manner  // in progress
  public static Linked_List mergesortedlinkedlist(Linked_List lst1, Linked_List lst2) {
	  Linked_List.Node ptr1 = lst1.head;
	  Linked_List.Node ptr2 = lst2.head;
	  while(ptr2 != null) {
		  int data2 = ptr2.data;
		  lst1 = insertintosorted(lst1, data2);
		  ptr2 = ptr2.ptr;
	  }
	  return lst1;
   }
 
// method to insert a node into a linkedList in a sorted way 
// want to work on the code optimization technique
  
  public static Linked_List insertintosorted(Linked_List lst1, int data) {
	  Linked_List.Node ptr1 = lst1.head;
	  Linked_List.Node ptr2 = null;
	  Linked_List.Node datanode = new Linked_List().new Node();
	  datanode.data = data;
	  datanode.ptr = null;
	  while(ptr1 != null) {
		  if(ptr1.data < data) {
			  ptr2 = ptr1;
			  ptr1 = ptr1.ptr;
		  }
		  else 
			  break;	  
	  }
	  if(ptr2 == null) {
		  lst1.head = datanode;
		  datanode.ptr = ptr1;
		  return lst1;
	  }
	  
	  ptr2.ptr = datanode;
	  datanode.ptr = ptr1;
	  return lst1;
  }
}