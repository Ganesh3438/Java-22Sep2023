package javaPrograms;

public class WAP32_Array_ProductOfTheArray {

	public static void main(String[] args) {


		int[] arr = {1,2,3,4,5};
		int sum = 1;
		
		for(int i=0; i<arr.length; i++) {
			sum = sum * arr[i];
		}
		
		System.out.println(sum);

	}

}
