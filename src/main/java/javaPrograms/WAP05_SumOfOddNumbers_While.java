package javaPrograms;

import java.util.Scanner;

// Problem Description
//
// Take an integer A as input. 
// You have to print the sum of all odd numbers in the range [1, A].

public class WAP05_SumOfOddNumbers_While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value");
		int n = sc.nextInt();
		
		int i=1;
		int sumOdd = 0;
		
		while(i<=n) {
			if(i%2!=0) {
				sumOdd = sumOdd + i;
			}
			i++;
		}
		
		System.out.println(sumOdd);

	}

}
