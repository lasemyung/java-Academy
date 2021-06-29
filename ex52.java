package examples;

import java.util.Random;

public class ex52 {
	
	public static void main(String[] args) throws InterruptedException {

		Random rand = new Random();
		
		int ball_count = 0;
		int strike_count = 0;
		
		while(true) {
			int ball = rand.nextInt(2); //0이면 볼, 1이면 스트라이크
			if( ball == 0 ) {
				System.out.println("볼");
				ball_count ++;
			}
			else if( ball == 1 ) {
				System.out.println("스트라이크");
				strike_count ++;
			}
			if( ball_count == 4 ) {
				System.out.println("1루 진루!");
				break;
			}
			if( strike_count == 3 ) {
				System.out.println("스트라이크 아웃!");
				break;
			}
			Thread.sleep(1000); //1초 sleep(진행을 멈춤)
		}
	}
}