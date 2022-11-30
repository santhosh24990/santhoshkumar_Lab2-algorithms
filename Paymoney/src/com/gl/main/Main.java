package com.gl.main;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int totaltransactions;
		System.out.println("Enter the size of transaction array");
		Scanner sc = new Scanner(System.in);
		totaltransactions = sc.nextInt();
		int transactionarray[] = new int[totaltransactions];
		System.out.println("Enter the values of array");
		for (int i = 0; i < totaltransactions; i++) {
			transactionarray[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targets = sc.nextInt();
		for (int i = 0; i < targets; i++) {
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			int sum = 0;
			for (int j = 0; j < totaltransactions; j++) {
				sum = sum + transactionarray[j];

				if (sum >= target) {
					System.out.println("Target achieved after  " + ++j + " transactions");
					break;
				}

			}
			if (target > sum) {
				System.out.println("Given target is not achieved ");
			}
		}
	}
}
