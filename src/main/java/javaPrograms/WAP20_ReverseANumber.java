package javaPrograms;

import java.util.Scanner;

public class WAP20_ReverseANumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value");
		int n = sc.nextInt();
		
		int rev = 0;
		
		for(; n>0; n=n/10) {
			int d = n %10;
			rev = rev*10+d;
		}
		
		System.out.println(rev);

	}

}
