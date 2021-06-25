package examples;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
//		콘솔(console : 표준입출력 - 키보드,모니터)로 부터
//		문자열 입력받기 - js : prompt () 함수
//						- java : scanner 클래스의 함수를 이용
		Scanner scan = new Scanner (System.in);
//		클래스이름 객체이름 = new(객체생성 예약어) 클래스이름(매개변수);
		
//		키보드로부터 문자열 한줄을 입력받는다
		System.out.println( "문자열을 입력하세요" );

		String message = scan.nextLine();
		System.out.println( message );
	}

}
