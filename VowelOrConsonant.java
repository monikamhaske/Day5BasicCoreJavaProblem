package Test;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = sc.next().charAt(0);
		sc.close();
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U')
			System.out.println(ch + " is vowel");
		else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			System.out.println("Entered character " + ch + " is Consonent");
		else
			System.out.println(ch + " is not a alphabet");

	}
}
