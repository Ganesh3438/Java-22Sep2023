package javaPrograms;

import java.util.Scanner;

// Problem Description
//
// Write a program to find sum all
// Natural numbers from 1 to N where you have to take N as input from user

public class WAP04_SumOfNaturalUsingWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value");
		int n = sc.nextInt();
		
		int i=1;
		int sum = 0;
		
		while(i<=n) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
		
	}

}
