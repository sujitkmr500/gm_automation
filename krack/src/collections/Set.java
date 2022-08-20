package collections;

import java.util.Arrays;
import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		Integer[] A = {1,2,3,4,5};
		Integer[] B = {5,6,7,8,9};
		HashSet<Integer> set = new HashSet<Integer>();
		set.addAll(Arrays.asList(A));
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(B));
		
		 // Finding Union of set1 and set2
	}

}
