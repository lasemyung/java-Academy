package examples;

import java.util.Random;

public class ex40 {

	public static void main(String[] args) {
//		----------------------------------
		for (int i = 5; i <= 10; i++) {
			System.out.println(i);
		}

		for (int i = 10; i >= -10; i--) {
			System.out.println(i);
		}

		for (int i = 1; i <= 100; i += 3) {
			System.out.println(i);
		}

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 10 == 0) {
				System.out.println(i);
			}
		}

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= i; j++) {
				if (i != j && i % j == 0)
					break;
				if (i == j) {
					System.out.print(i + " ");
				}
			}
		}

		int i = 0;
		Random rand = new Random();
		int n = rand.nextInt(10) + 1;
		int fac = 1;
		System.out.println(n);

		for (i = n; i >= 1; i--) {
			fac = fac * i;
		}
		System.out.println(n + "!=" + fac);

	}
}
