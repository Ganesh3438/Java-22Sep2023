package duplicateJavaPrograms;

public class TC15_AddingElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int index = 9;
		int value = 10;
		int n = arr.length;
		int[] ans = new int[n+1];
		
		for(int i=0; i<index; i++) {
			ans[i] = arr[i];
		}
		
		ans[index] = value ;
		for(int i=index; i<n; i++) {
			ans[i+1] = arr[i];
		}
		
		// 
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		

	}

}
