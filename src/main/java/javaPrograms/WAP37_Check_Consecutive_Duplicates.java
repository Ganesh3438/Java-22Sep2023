package javaPrograms;

public class WAP37_Check_Consecutive_Duplicates {
	
	public static boolean duplicates(int[] arr) {
		
	   int n = arr.length;
	   
	   for(int i=0; i<n-1; i++) {
		   
		   if(arr[i]==arr[i+1]) {
			   return true;
		   }
	   }
	   
		
		return false;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,1,1,5};
		
		boolean status = WAP37_Check_Consecutive_Duplicates.duplicates(arr);
		System.out.println(status);
		
	}

}
