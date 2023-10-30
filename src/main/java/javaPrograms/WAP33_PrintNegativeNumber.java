package javaPrograms;

public class WAP33_PrintNegativeNumber {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4,-1, 5, -2, 6, -3, 9, -13};
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]<0) {
				System.out.println(arr[i] + " ");
			}
			
		}

	}

}
