package examples;

import java.util.Random;


public class ex37 {

	public static void main(String[] args) {

		Random rand = new Random();
		int season = rand.nextInt(12)+1;
		System.out.println(season);

		switch (season) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("없는 계절입니다.");
			break;	
		}
	}
}
