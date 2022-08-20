package collections;

import java.util.ArrayList;

public class C_ArrayList_example_to_add_elements {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		ArrayList<Integer> int_list = new ArrayList<Integer>();
		ArrayList<String> str_list = new ArrayList<String>();
		
		list.add("b");list.add("c");
		int_list.add(1);int_list.add(2);
		str_list.add("APPLE");str_list.add("BALL");
		
		System.out.println("list : "+list);
		list.add(0,"a");
		System.out.println("list : "+list);
		list.addAll(int_list);
		System.out.println("list : "+list);
		list.add(1,str_list);
		System.out.println("list : "+list);
		
	
	
	
	
	
	
	
	}
}
