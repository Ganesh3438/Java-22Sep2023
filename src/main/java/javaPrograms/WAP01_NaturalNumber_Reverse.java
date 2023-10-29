package javaPrograms;

import java.util.Scanner;

// Problem Description
//
// Write a program to print all Natural numbers from N to 1 where you have 
// to take N as input from user

public class WAP01_NaturalNumber_Reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value");
		int n = sc.nextInt();
		
		int i = n;
		
		while(i>=1) {
			System.out.println(i);
			i--;
		}

	}

}
