package javaPrograms;

import java.util.Scanner;

//Write a program to print all odd numbers from 1 to N where you 
//have to take N as input from user.Here N is inclusive.

public class WAP02_OddNumbersUsingWhileLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value");
		int n = sc.nextInt();
		
		int i = 1;
		while(i<=n) {
			if(i%2!=0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
