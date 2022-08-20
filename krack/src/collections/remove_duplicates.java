package collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class remove_duplicates {

	public static void main(String[] args) {
		List alist = new ArrayList<String>();
		alist.add("A");
		alist.add("B");
		alist.add("A");
		alist.add("B");
		alist.add("C");
		alist.add("D");
		System.out.println(alist);
		System.out.println(alist.toString());
		Set<String> set = new LinkedHashSet<>(alist);
		System.out.println(set);
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("C");
		al2.add("D");
		al2.add("E");
		al2.add("F");
		ArrayList<String> al3 = new ArrayList<String>();
		al3.addAll(al);
		al3.addAll(al2);
		System.out.println("------"+al3);
		al3.retainAll(al2);
		System.out.println("@@@@"+al3);
		al3.removeAll(al);
		System.out.println("@@@@"+al3);
	}
}