package examples;

public class ex66 {
	// 연습문제
	// 1.
	// sum이라는 메소드를 하나 만들자
	// 이 메소드는 정수 2개를 매개변수로 받고,
	// 이 두 정수를 합산해서, 반환값으로 전달하는 메소드이다.
	// 출력값: 10과 20의 합산은 30
	
	static int sum (int param1, int param2) {
		return param1 + param2;
	}
	
	// 2.
	// String을 매개변수로 받는 메소드 echo를 선언하고,
	// 그 String 문자열을 출력하는 메소드를 호출하세요.
	// 반환값은 없음
	// 출력값: "자바 프로그래밍!"
		
		static void echo ( String message ) {
			System.out.println(message);
			return;
		}
	
	public static void main(String[] args) {
		
		int result = sum ( 10, 20);
		System.out.println(result);
		
		echo("자바 프로그래밍!");

	}
}