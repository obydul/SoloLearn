package com.obydul.loops;

import java.util.Scanner;

public class LoanCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int balance = 0, result = 0;

		for (int i = 0; i < 3; i++) {
			balance = (amount * 10) / 100;
			//System.out.println("Payment 10 % of " + amount + " = " + balance);
			result = amount - balance;
			//System.out.println("Remaining amount = " + result);
			amount = result;
			// System.out.println("amount : " + amount);
		}
		System.out.println(result);

	}

}
