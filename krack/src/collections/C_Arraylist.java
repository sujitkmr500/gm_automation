package collections;

import java.util.ArrayList;
import java.util.Iterator;


public class C_Arraylist {

	public static void main(String[] args) {
		//creating old non-generic arraylist  
		ArrayList al = new ArrayList();
		//generic arraylist
		ArrayList<String> alstr = new ArrayList<String>();
		al.add("100");
		al.add("200");
		al.add(300);
		al.add(400.400);
		al.add("five hundreed");
		System.out.println(al);//arraylist example
		
		for(int i = 0;i<=al.size()-1;i++)//for loop
		{
			System.out.println(al.get(i));
		}
		
		for(Object str:al)//for each loop
		{
			System.out.println(str);
		}
		
		Iterator itr = al.iterator();
		while(itr.hasNext())//by yusing iterator class
		{
			System.out.println("iterating : "+itr.next());
		}
	}

}
