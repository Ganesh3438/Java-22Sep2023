package javaPrograms;

public class WAP50_FindUniqueElements {

	public static void main(String[] args) {
		
		 int arr[] = {10, 20, 30, 10, 12, 10};
		 
		 for(int i=0; i<arr.length; i++) {
			 
			 int val = arr[i];
			 int frq = 0;
			 
			 for(int j=0; j<arr.length; j++) {
				 if(arr[j] == val) {
					 frq++;
				 }
			 }
			 
			 
			 
			 if(frq==1) {
					System.out.print(arr[i] + " "); 
				 }
					 
		 }
		 
		 

	}

}
