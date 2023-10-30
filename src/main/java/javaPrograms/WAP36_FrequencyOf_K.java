package javaPrograms;

public class WAP36_FrequencyOf_K {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 1, 1, 22, 2, 8};
		int k = 1;
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==k) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
