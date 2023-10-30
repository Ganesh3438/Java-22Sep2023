package javaPrograms;

import java.util.Scanner;

// Given a number, find sum of all digits

public class WAP14_SumofGivenNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the value");
		int n = sc.nextInt();
		int sum = 0;
		while(n>0) {
			int rem = n%10;
			sum = sum + rem;
			n = n/10;
		}
		System.out.println(sum);
	}

}
