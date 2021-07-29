package Test;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		System.out.println("Enter number of times to flip");
		Scanner coin = new Scanner(System.in);
		int times = coin.nextInt();
		System.out.println("number of times are " + times);
		double head = 0;
		double tail = 0;
		while (times > 0) {
			double a = Math.random();
			System.out.println(a);
			if (a < 0.5) {
				System.out.println("heads");
				head = (head + 1);
			} else {
				System.out.println("tails");
				tail = (tail + 1);
			}
			times--;
		}
		double hper = ((head / (head + tail)) * 100);
		double tper = ((tail / (head + tail)) * 100);
		System.out.println("heads percentage is " + hper);
		System.out.println("tails percentage is " + tper);
		coin.close();

	}

}
