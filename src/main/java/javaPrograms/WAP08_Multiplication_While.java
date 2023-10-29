package javaPrograms;

import java.util.Scanner;

public class WAP08_Multiplication_While {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the values");
		int n = sc.nextInt();
		
		int i=1;
		while(i<=10) {
		
			System.out.println(n + "*" + i + "="+ (n*i));
			i++;
		}
		
	}

}
