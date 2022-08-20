package collections;

import java.util.ArrayList;

public class C_Array_methods {

	public static void main(String[] args) {
		//isEmpty()
		//retain All()
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("is empty check : "+list.isEmpty());
		list.add("1");list.add("2");list.add("3");list.add("4");list.add("5");list.add("6");
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("7");list1.add("8");list1.add("9");list1.add("10");list1.add("5");list1.add("6");
		System.out.println("list : "+list);
		System.out.println("list1 : "+list1);
		list.retainAll(list1);//retain the values of list1, it wont remove the common values of list
		System.out.println("list : "+list);
		System.out.println("list1 : "+list1);
		System.out.println("is empty check : "+list.isEmpty());
	}
}
