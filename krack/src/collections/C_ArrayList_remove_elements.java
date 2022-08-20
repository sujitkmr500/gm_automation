package collections;

import java.util.ArrayList;
import java.util.List;

public class C_ArrayList_remove_elements 
{
	public static void main (String args[]) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");list.add("g");
		list.add("B");list.add("h");
		list.add("C");list.add("A");
		list.add("D");list.add("K");
		
		System.out.println("List 1: "+list);
		list.remove(1);
		System.out.println("List 2: "+list);
		list.remove(list);
		System.out.println("List 3: "+list);
		list.removeAll(list);
		System.out.println("List 4: "+list);
		System.out.println("List size : "+list.size());
		list.add("L");list.add("P");
		list.add("M");list.add("Q");
		System.out.println("List 5: "+list);
		System.out.println("List size : "+list.size());
		list.clear();
		System.out.println("List 6: "+list);
		System.out.println("List size : "+list.size());
		list.add("N");list.add("R");
		list.add("O");list.add("L");
		System.out.println("List 7: "+list);
		System.out.println("List size : "+list.size());
		list.removeIf(str-> str.contains("L"));
		{
			System.out.println("INVOKING removeIf method : "+list);
		}
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("abc");
		list1.add("def");
		System.out.println("list : "+list);
		System.out.println("list1 : "+list1);
		list.addAll(list1);
		System.out.println("Updated list : "+list);
		list.removeAll(list1);
		System.out.println("Updated list after calling the removeALl(list1): "+list);
		
	}

}
