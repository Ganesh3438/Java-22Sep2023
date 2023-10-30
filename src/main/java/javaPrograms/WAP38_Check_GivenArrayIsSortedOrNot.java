package javaPrograms;

public class WAP38_Check_GivenArrayIsSortedOrNot {

	public static boolean checkArraySorted(int[] arr) {
		
	    for(int i=0; i<arr.length-1; i++) {
	    	
	    	if(arr[i]<arr[i+1]) {
	    		// do nothing
	    	}else {
	    		return false;
	    	}
	    	
	    }
		
		
		return true;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2, 3, 4};
		
		boolean status = WAP38_Check_GivenArrayIsSortedOrNot.checkArraySorted(arr);
		System.out.println(status);

	}

}
