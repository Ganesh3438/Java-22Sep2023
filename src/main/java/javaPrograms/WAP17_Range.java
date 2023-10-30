package javaPrograms;

import java.util.Scanner;

// Problem Description
// Given two numbers, A and B, your task is to print all the numbers in the 
// range from A to B (both inclusive), with each number followed by a space, 
// including the last number.

public class WAP17_Range {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the value");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int i = a;
		int j = b;
				
		
		while(i<=j) {
			System.out.println(i);
			i++;
		}
		
	}

}
