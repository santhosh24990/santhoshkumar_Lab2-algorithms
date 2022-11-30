package com.gl.main;

import java.util.Scanner;

public class Denomination {

	public static void main(String[] args) {

		int totaldenominations;
		System.out.println("Enter the size of currency denominations");
		Scanner sc = new Scanner(System.in);
		totaldenominations = sc.nextInt();
		int denominationarray[] = new int[totaldenominations];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < totaldenominations; i++) {
			denominationarray[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int target = sc.nextInt();
		int temp = 0;
		for (int i = 0; i < totaldenominations; i++) {
			for (int j = i + 1; j < totaldenominations; j++) {
				if (denominationarray[i] < denominationarray[j]) {
					temp = denominationarray[i];
					denominationarray[i] = denominationarray[j];
					denominationarray[j] = temp;
				}
			}
		}

		int b[] = new int[totaldenominations];
		for (int i = 0; i < totaldenominations; i++) {
			int c = target / denominationarray[i];
			b[i] = c;
			target = target - (c * denominationarray[i]);
			if (target == 0)
				break;
		}

		System.out.println("Your payment approach in order to give min no of notes will be");
		for (int i = 0; i < totaldenominations; i++) {
			if (b[i] > 0)
				System.out.println(denominationarray[i] + ":" + b[i]);
		}

	}

}
