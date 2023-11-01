package javaPrograms;

public class WAP30_Array_MaxAndMin {

	public static void main(String[] args) {
		
		int[] arr = {100, 200, 1, 300, 150, 12000, 6};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
//			if(max<arr[i]) {
//				max = arr[i];
//			} 
//			
//			if(min>arr[i]) {
//				min = arr[i];
//			}
			
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}

		System.out.println("Maximum value: "+max);
		System.out.println("Minimum value: "+min);
	}

}
