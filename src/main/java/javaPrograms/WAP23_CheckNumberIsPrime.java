package javaPrograms;

import java.util.Scanner;

public class WAP23_CheckNumberIsPrime {

	public static void main(String[] args) {
		
//		Prime number: A positive number with only two factors (one and itself)
//		is know as prime number
		
//		Composite number: A positive number with more than two factors
		
//		1 is neither prime or composite
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("It is a prime number");
		}else {
			System.out.println("It is not a prime number");
		}
		
		
		
	}

}
