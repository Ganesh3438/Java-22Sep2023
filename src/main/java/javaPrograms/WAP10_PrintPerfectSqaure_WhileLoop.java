package javaPrograms;

import java.util.Scanner;

// Problem Description
//
// Take an input of a number A from the user. Print all perfect squares less than 
// or equal to A.
// Note - Perfect squares are integers whose square root is an integer. 
// (For Example: 16 is perfect square as √16 = 4, or 42 = 16)

public class WAP10_PrintPerfectSqaure_WhileLoop {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the value");
		int n = sc.nextInt();
		
		int i = 1;
		while(i*i<=n) {
			System.out.println(i*i);
			i++;
		}
		

	}

}
