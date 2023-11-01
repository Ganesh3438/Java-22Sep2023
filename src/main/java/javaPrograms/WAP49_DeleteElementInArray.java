package javaPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class WAP49_DeleteElementInArray {


	
	
	public static void main(String[] args) {
		
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
		
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr_new = new int[arr.length-1];
        int j=3;
        for(int i=0, k=0; i<arr.length;i++){
            if(i!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
//        System.out.println("Before deletion :" + Arrays.toString(arr));
//        System.out.println("After deletion :" + Arrays.toString(arr_new));
        
        for(int i=0; i<arr_new.length; i++) {
        	System.out.println(arr_new[i] + " ");
        }
        

		
		

	}

}
