package javaPrograms;

import java.util.Scanner;

public class WAP26_Leapyear {

	public static void main(String[] args) {

		
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
//	        if(A%400==0)
//	        {
//	            System.out.println(1);
//	        }
//	        else if(A%4==0 && A%100!=0)
//	        {
//	            System.out.println(1);
//	        }
//	        else{
//	            System.out.println(0);
//	        }
	        
	        if(n%400==0 || (n%4==0 && n%100!=0)) {
	        	System.out.println("It is leap year");
	        }else {
	        	System.out.println("It is not a leap year");
	        }

	        
	        
	}

}
