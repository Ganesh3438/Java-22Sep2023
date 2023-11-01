package javaPrograms;

public class WAP48_AddingElement_InArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3};
		int n = arr.length;
		int index = 1;
		int value = 4;
		
	    int[] ans = new int[n+1];
	    
	    for(int i=0; i<index; i++) {
	    	ans[i] = arr[i];
	    }
	    
	    ans[index] = value;
	    
	    for(int i=index; i<n; i++) {
	    	ans[i+1] = arr[i];
//	    	System.out.print(ans[i] +  " ");
	    }
	    
	    for(int i=0; i<ans.length; i++) {
	    	System.out.print(ans[i] +  " ");
	    }
		

	}

}
