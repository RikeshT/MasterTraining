package Java_Programs;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// this required to take input
		System.out.println("Enter a number:");
		int n = scanner.nextInt();// Reads the integer from the user
		Boolean isPrime = true;
		if (n <= 1) {
			isPrime = false;
			System.out.println("Is prime Number:" + isPrime + n);
		} else {
//to check the divisibility of numbers
			for (int i = 0; i <= n; i++) {
				if (n % 2 == 0) {
					isPrime = false;
				}

			}
			if (isPrime) {
				System.out.println("Is prime Number:" + isPrime + n);
			} else {
				System.out.println("Is prime Number:" + isPrime + n);
			}
		}
		scanner.close();
	}
}
