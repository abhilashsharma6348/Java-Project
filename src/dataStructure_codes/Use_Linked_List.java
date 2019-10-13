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
	  System.out.println("After inserting an element in the linked list");
	  Linked_List lst1 = insert(lst,44,4);
	  print(lst1);
	  System.out.println("After deleting an element from a linked list");
	  Linked_List lst2 = delete(lst, 78);
	  print(lst2);
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
}