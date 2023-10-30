package javaPrograms;

import java.util.Scanner;

// Give a positive no(integer). print last digit of number

public class WAP13_PrintLastDigitOfANumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value");
		int n = sc.nextInt();
		
		int rem = n % 10;
		System.out.println(rem);
		

				

	}

}
