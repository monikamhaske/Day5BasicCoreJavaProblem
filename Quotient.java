package Test;

import java.util.Scanner;

public class Quotient {
	public static void main(String[] args) {
		

		int dividend, divisor, quo, rem;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Dividend:");
		dividend = sc.nextInt();

		System.out.print("Enter Divisor:");
		divisor = sc.nextInt();

		sc.close();
		quo = dividend / divisor;

		rem = dividend % divisor;

		System.out.println("Quotient: " + quo);
		System.out.println("Remainder: " + rem);

	}

}
