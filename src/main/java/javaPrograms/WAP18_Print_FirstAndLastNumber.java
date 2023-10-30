package javaPrograms;

import java.util.Scanner;

public class WAP18_Print_FirstAndLastNumber {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value");
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int ld = n % 10;
			int fd = 0;
			
			for(;n>0; n = n/10) {
				int rem = n %10;
				fd = rem;
//				n = n /10;
			}
			
			System.out.print(fd + " "+ ld);
			
			t--;
			
		}

	}

}
