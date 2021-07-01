package examples;

import java.util.Date;
import java.util.Random;

public class ex38 {

	public static void main(String[] args) throws InterruptedException {

		Random rand = new Random();
		int code = rand.nextInt(4) + 1;
		System.out.println(code);

		switch (code) {
		case 1:
			System.out.println("음악을 틀어준다");
			break;
		case 2:
			System.out.println("간식을 준다");
			break;
		case 3:
			System.out.println("주인의 영상을 틀어준다.");
			break;
		case 4:
			System.out.println("산책을 시켜준다");
			break;
		default:
			System.out.println("잘못 됐습니다");
			break;
		}

		Thread.sleep(3000);

		int code2 = rand.nextInt(4) + 1;
		System.out.println(code2);

		if (code2 == 1) {
			System.out.println("음악을 틀어준다");
		} else if (code2 == 2) {
			System.out.println("간식을 준다");
		} else if (code2 == 3) {
			System.out.println("주인의 영상을 틀어준다.");
		} else if (code2 == 4) {
			System.out.println("산책을 시켜준다");
		} else {
			System.out.println("잘못 됐습니다");
		}

	}

}
