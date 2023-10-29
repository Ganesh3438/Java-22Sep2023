package javaPrograms;

import java.util.Scanner;

// Problem Description
//
// You are given a positive integer A. 
// You have to print the sum of all even numbers in the range [1, A].

public class WAP06_SumofEven_WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value");
		int n = sc.nextInt();
		
		
		int i =1;
		int sumEven = 0;
		
		while(i<=n) {
			if(i%2==0) {
				sumEven = sumEven + i;
			}
			i++;
		}
		
		System.out.println(sumEven);

	}

}
