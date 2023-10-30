package javaPrograms;

import java.util.Scanner;

// Given T numbers, Print last digit of every no 

public class WAP15_Multipletestcases_PrintLastDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the value");
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int rem = n %10;
			System.out.println(rem);
			
			t--;
		}

	}

}
