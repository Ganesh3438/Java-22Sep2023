package javaPrograms;

public class WAP35_Array_Check_K_IsPresent {

	public static void main(String[] args) {
		
		
		int[] arr = {1, 2, 4, 5, 6, 7};
		int k = 4;
		boolean status = false;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==k) {
				status = true;
			}
		}
        System.out.println(status);
	}

}
