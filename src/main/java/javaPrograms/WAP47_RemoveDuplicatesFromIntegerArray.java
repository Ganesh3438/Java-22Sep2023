package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class WAP47_RemoveDuplicatesFromIntegerArray {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 1, 4, 3 };
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			
			if (!set.equals(arr[i])) {
				set.add(arr[i]);
			}
		}
		System.out.println(set);
	}

}
