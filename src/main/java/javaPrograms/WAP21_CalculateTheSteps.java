package javaPrograms;

import java.util.Scanner;

//Problem Description
//Given a number N, each time N gets divided by 2. 
//How many times do we need to divide N by 2 in order to get 1 as the 
//final result ?


public class WAP21_CalculateTheSteps {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value");
		int n = sc.nextInt();
		
		int count = 0;
		for(; n>1; ) {
			n = n/2;
			count++;
		}

		 
	}

}
