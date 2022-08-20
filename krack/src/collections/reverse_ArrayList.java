package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class reverse_ArrayList {
	public static void main(String args[])
	{
		List list  = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list.toString());
		Collections.reverse(list);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
