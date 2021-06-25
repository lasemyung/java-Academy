package examples;

import java.util.Random;

public class ex33 {

	public static void main(String[] args) {
		
//		난수 발생 ( Random 수 발생, 임의의 수 )
//		방법1
//		random 클래스 이용
		Random rand = new Random();
		int randomNumber = rand.nextInt( 100 ); //0~99 까지의 임의의 수 발생
		System.out.println( "임의의 수" + randomNumber );
		
//		방법2
//		math 클래스 이용
//		math.random()함수 0.0~0.9999999.... 임의의 수 반환
		int randomNumber2 =(int)( Math.random() * 100 ); //0~99까지의 임의의 수
	}

}
