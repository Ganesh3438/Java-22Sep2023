package javaPrograms;

import java.util.Scanner;

// Problem Description
//
// You are given two integers A and B. You have to find the value of AB.
//
// NOTE: The value of AB will always be less than or equal to 109.

public class WAP07_Power {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 1;
		
		while(b>=1) {
			c = c*a;
			b--;
		}
        System.out.println(c);
	}

}
