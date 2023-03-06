package org.example;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrLength = scanner.nextInt();
		int[][] arr = new int[arrLength][arrLength];

		for (int i = 0; i < arrLength; i++) {
			for (int j = arrLength - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}