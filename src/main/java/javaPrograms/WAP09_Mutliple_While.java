package javaPrograms;

import java.util.Scanner;

// Problem Description
// Given an integer input N, print all multiples of 4 less than or equal to N.

public class WAP09_Mutliple_While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the values");
		int n = sc.nextInt();
	
		 int i=4;
		 int j = 1;
		 while(i<n) {
				System.out.println(i);
				i= i + 4;
			
		 }
	}

}
