package collections;

import java.util.*;

public class C_ArrayList_Functions {

	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();//non generic
		ArrayList<String> str_list = new ArrayList<String>();//generic type string
		ArrayList<Integer> int_list = new ArrayList<Integer>();//generic type Integer
		
		list.add("a");list.add(1);list.add(8.8);
		str_list.add("a");str_list.add("b");str_list.add("c");
		int_list.add(31);int_list.add(12);int_list.add(54);int_list.add(31);
		
		System.out.println("list : "+list);
		System.out.println("str_list : "+str_list);
		System.out.println("int_list : "+int_list);
		
		//Get and Set ArrayList
		System.out.println("index of 2 : "+list.get(2));
		list.set(2, 9.9);
		System.out.println("index of 2 set as :  "+list.get(2));
		System.out.println("list : "+list);
		
		//Sort ArrayList
		Collections.sort(int_list);//sorting the list
		System.out.println(int_list);
		
		//Ways to iterate the elements of the collection in Java
		System.out.println("~~~~~~~~~~~~~~~~~~~looping 1. By Iterator interface~~~~~~~~~~~~~`");
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println("list : "+itr.next());
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~Looping 2. By for-each loop~~~~~~~~~~~~~~~~~~~");
		for(int val : int_list)
		{
			System.out.println("int_list : "+val);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~3. By ListIterator interface~~~~~~~~~~~~~~~~~~~");
		ListIterator<String> li = str_list.listIterator(str_list.size());
		  while(li.hasPrevious())  
          {  
              String str=li.previous();  
              System.out.println("List iterator : "+str);  
          }  
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Looping 4. By for loop~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i = 0;i<=str_list.size()-1;i++)
		{
			System.out.println("str_list : "+str_list.get(i));
		}
		System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~Looping 5. By forEach()~~~~~~~~~~~~~~~~~~~");
		//The forEach() method is a new feature, introduced in Java 8.  
        list.forEach(a->{ //Here, we are using lambda expression  
            System.out.println("For each method : "+a);  
          });  
        System.out.println("~~~~~~~~~~~~~~~~~~~~~6. By forEachRemaining() method~~~~~~~~~~~~~~~~~~");
        Iterator<String> itr_str = str_list.iterator();
        itr_str.forEachRemaining(a->{System.out.println("forEachRemaining() : "+a);});
		
	}

}
