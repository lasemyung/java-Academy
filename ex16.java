package examples;

public class ex16 {
	
	public static void main(String[] args) {
		//상수에 대해서
		//변수 -> 변하는 수 -> 저장공간
		//상수 -> 변하는 않는 수 -> 변수인데, 한번 값을 넣으면 바꿀 수 없는 변수
		//final 예약어
		final float PI = 3.141592f;
		//PI = 3.45f; //값을 다시 넣으면 에러!
		//연습문제
		//PI를 이용하여, 반지름이 10인 원의 원둘레(길이)를 구하시오.
		//2 * PI * r = 원주(원의 길이)
		int r = 10;
		System.out.println( "원의 길이: " + (2 * PI * r) );
		// long * int => long
		// short * int => int
		// float * int => float
		// float * double => double
	}
}
}