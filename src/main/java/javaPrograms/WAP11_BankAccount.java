package javaPrograms;

import java.util.Scanner;

//Problem Description
//You have been provided with a bank account that has an initial balance of N amount. You are now required to perform two operations on this account, namely, ADD and SUBTRACT.
//
//ADD operation: This operation increases the account balance by a certain amount and you are expected to print the updated balance after each ADD operation.
//SUBTRACT operation: This operation decreases the account balance by a certain amount and you are again expected to print the updated balance after each SUBTRACT operation.
//However, if the amount you are trying to subtract (i.e., debit) from the account balance is greater than the current balance, you should print "Insufficient Funds" (without quotes) instead of the updated balance. In this case, the operation should be skipped, and the account balance should remain unchanged.
//
//Note :
//Initial Amount N and Amount that is given are larger numbers.

public class WAP11_BankAccount {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		long N = scn.nextLong();
		int M = scn.nextInt();
		while (M > 0) {
			int opr = scn.nextInt();
			long amt = scn.nextLong();
			if (opr == 1) {
				N = N + amt;
				System.out.println(N);
			} else {
				if (amt > N) {
					System.out.println("Insufficient Funds");
				} else {
					N = N - amt;
					System.out.println(N);
				}
			}
			M--;
		}

	}

}
