package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class C_LinkedList_Reverse
{
	public static void main(String args[])
	{
		LinkedList<String> ll  = new LinkedList<String>();
		ll.add("A");ll.add("B");ll.add("C");ll.add("D");
		System.out.println(ll);
		 //Traversing the list of elements in reverse order  
		Iterator itr = ll.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ll.push("abc");ll.push("def");
		System.out.println(ll);
		ll.pop();
		System.out.println(ll);
		ll.poll();
		System.out.println(ll);
	}
}
