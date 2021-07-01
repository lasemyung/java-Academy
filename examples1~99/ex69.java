package examples;

public class ex69 {
			
//	메소드 오버로딩 ( Over loading):
//	매개 변수만 다른 함수
	
	static void echo() {
		System.out.println("echo() 매개변수없음");
	}
	
	static void echo(String message) {
		System.out.println("echo()" + message);
	}
	
	static void echo(int number) {
		System.out.println("echo()" + number);
	}
	
	public static void main(String[] args) {
		
		echo ();
		echo("에코!");
		echo(10);
		
//	 system.out.println 함수도 확장(오버로딩)이 되는 함수이다.
		
	}

}
