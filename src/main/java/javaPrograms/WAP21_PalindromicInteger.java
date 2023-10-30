package javaPrograms;

import java.util.Scanner;

// Problem Description
// You are given an integer A as input and you need to determine whether 
// it is a palindrome or not.
// A palindrome integer is one whose digits, when reversed, result 
// in the same number.
// For example, 121 is a palindrome because its reverse is also 121, 
// but 123 is not a palindrome because its reverse is 321.

public class WAP21_PalindromicInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value");
		int n = sc.nextInt();
		
		int a = n;
		int rev =0;
		for(; a>0; a=a/10) {
			int d = a%10;
			rev = rev *10+d;
		}
		
		if(rev==n) {
			System.out.println("It is a palindrome Integer");
		}else {
			System.out.println("It is not a palindrome Integer");
		}

	}

}
