package com.task;

import java.util.Scanner;

public class NRowProblem {
	public static void main(String[] args) {
		System.out.println("Enter Number Of Students.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter First Math Student Position.");
		sc = new Scanner(System.in);
		int pos = sc.nextInt();
		if (pos > n / 2 + n/10) {
			System.out.println("Starting Position Must Be Between 1 to " + (n / 2 + n/10));
		} else {
			System.out.println("Possible Positions Are With Starting Form : " + pos);
			for (int i = pos; i <= n; i += 2) {
				System.out.print(i + ", ");
			}
		}

	}
}
