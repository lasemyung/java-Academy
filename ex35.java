package examples;

import java.util.Random;

public class ex35 {

	public static void main(String[] args) {

		Random rand = new Random();
		int weather = rand.nextInt(4);
		System.out.println(weather);

		if (weather == 0) {
			System.out.println("날씨가 좋아유");
		} else if (weather == 1) {
			System.out.println("날씨가 흐려유");
		} else if (weather == 2) {
			System.out.println("날씨가 비와유");
		} else if (weather == 3) {
			System.out.println("날씨가 눈와유");
		} else {
			System.out.println("소나기가 와유");
		}
	}
}
