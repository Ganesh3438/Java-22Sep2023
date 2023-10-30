package javaPrograms;

import java.util.Scanner;

// Add digit d to the back of number r

public class WAP19_AddDigit_ToNumber {

	public static void main(String[] args) {
		
//		r = 198 d = 5;
//		num = 198*10+5 = 1985
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value");
		int n = sc.nextInt();
		int d = sc.nextInt();
		int ans = (n*10)+d;
		System.out.println(ans);

	}

}
