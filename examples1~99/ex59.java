package examples;

import java.util.Random;

public class ex59 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		Random rand = new Random();
		for (int i = 0; i < 6; i++) {
			lotto[i] = rand.nextInt(45) + 1;
			System.out.println(lotto[i]);

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					continue;
				}

			}

		}

	}
}