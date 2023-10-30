package javaPrograms;

import java.util.Scanner;

// Problem Description
// You have a number N, you have to write a 
// code to find odd digit sum and even digit sum from given number 
// and print it.

public class WAP16_SumOfEvenAndODD_ForANumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the value");
		int n = sc.nextInt();
		
		if(n==0) {
			System.out.println(0);
		}else if(n<0){
			n = -n;
		}
		int sumEven =0;
		int sumOdd = 0;
		while(n>0) {
			int rem = n%10;
			
			if(rem%2==0) {
				sumEven = sumEven + rem;
			}else {
				sumOdd = sumOdd + rem;
			}
			
			n= n/10;
			
		}
		
		System.out.println("The sum of even number are: "+sumEven);
		System.out.println("The sum of even number are: "+sumOdd);

	}

}
