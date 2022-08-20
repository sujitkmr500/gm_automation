package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class C_LinkedList {
	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		
		System.out.println("Linked List : "+ll);
		
		Iterator itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		 //Adding an element at the specific position
		ll.add(3, "d");
		System.out.println("Linked List : "+ll);
		//Adding second list elements to the first list
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("f");
		ll2.add("f");
		System.out.println("Linked List2 : "+ll2);
		ll.addAll(ll2);
		System.out.println("Linked List : "+ll);
		//Adding second list elements to the first list at specific position  
		ll.addAll(0, ll2);
		System.out.println("Linked List : "+ll);
		//Adding an element at the first position  
		ll.add(0,"g");
		System.out.println("Linked List : "+ll);
		ll.addFirst("h");
		System.out.println("Linked List : "+ll);
		//Adding an element at the last position 
		ll.addFirst("i");
		System.out.println("Linked List : "+ll);
		//Removing specific element from arraylist
		ll.remove(0);
		System.out.println("Linked List : "+ll);
		//Removing element on the basis of specific position
		 // Adding new elements to arraylist  
		 //Removing all the new elements from arraylist  
		//Removing first element from the list  
		ll.removeFirst();
		ll.removeFirstOccurrence("f");
		System.out.println("Linked List : "+ll);
		 //Removing first occurrence of element from the list 
		 //Removing last occurrence of element from the list  
		//Removing all the elements available in the list 
	}
}
