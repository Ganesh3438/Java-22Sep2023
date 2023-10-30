package javaPrograms;

public class WAP34_Array_CopyArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		int n = arr.length;
		int[] temp = new int[n];
		int b = 3;
		
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i]+b;
		}
		
		// 
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i]+ " ");
		}
	}

}
