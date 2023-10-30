package javaPrograms;

import java.util.Scanner;

public class WAP27_Armstrong {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value");
		int n = sc.nextInt();
	    int temp = n;
	    int sum = 0;
	   
	    while(n>0) {
	    	
	    	int d = n %10;
	    	sum = sum + d*d*d;
	    	n=n/10;
	    }
	
		if(temp==sum) {
			System.out.println("It is an armstrong number");
		}else {
			System.out.println("It is not an armstrong number");
		}
		

	}

}
