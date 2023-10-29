package javaPrograms;

import java.util.Scanner;


// Problem Description
// Write a program to print all even numbers 
// from 1 to N where you have to take N as input from the user.

public class WAP03_EvenNumberUsingWhileLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value");
		int n = sc.nextInt();
		
		int i =0;
		while(i<=n) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
