package javaPrograms;

import java.util.Scanner;

public class WAP_ReverseNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the value");
		int n = sc.nextInt();
		
		if(n==0) {
			System.out.println(0);
		}else if(n<0){
			n = -n;
		}
		
		while(n>0) {
			int rem = n%10;
			System.out.print(rem);
			n = n / 10;
		}
		
		
		
	}

}
