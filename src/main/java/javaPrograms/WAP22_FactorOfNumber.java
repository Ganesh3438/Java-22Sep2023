package javaPrograms;

import java.util.Scanner;

// Any value which can divide n completely is know as factors

public class WAP22_FactorOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}

}
