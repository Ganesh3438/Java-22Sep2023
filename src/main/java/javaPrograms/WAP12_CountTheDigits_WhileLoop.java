package javaPrograms;

import java.util.Scanner;

// Problem Description
// Take T (number of test cases) as input.
// For each test case, take integer N as input and Print the count of digits of that number.
//
// Note: No of digits for number 0 is considered as 1.

public class WAP12_CountTheDigits_WhileLoop {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0) {
			long n = sc.nextInt();
			int count = 0;
			if(n==0) {
				System.out.println("1");
			}else {
				while(n>0) {
					count ++;
					n = n/10;
				}
			    System.out.println(count);	
			}
			t--;
		}

	}

}
