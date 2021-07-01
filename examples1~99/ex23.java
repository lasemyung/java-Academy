package examples;

public class ex23 {
	
	public static void main(String[] args) {
		//연습문제
		//나머지 연산자 %, 산술연산자 +-*/ 사용
		int i = 12345; 
		
		//만의 자릿수를 찾아오자 출력예)1
		int k = (i / 10000);
		System.out.println( k );
		
		//천의 자릿수를 찾아오자 출력예)2
		int n = (i % 10000) / 1000;
		System.out.println( n );
		n = (i / 1000) % 10;
		System.out.println( n )
		
		//백의 자릿수,  출력예)3
		int m = (i % 1000) / 100;
		System.out.println( m );
		m = (i / 100) % 10;
		System.out.println( m );
		
		//십의 자릿수,  출력예)4
		int l = (i % 100) / 10;
		System.out.println( l );
		l = (i / 10) % 10;
		System.out.println( l );
		
		//일의 자릿수를 찾아보세요. 출력예)5
		int j = (i % 10);
		System.out.println( j );
	}
}