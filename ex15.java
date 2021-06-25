package examples;

public class ex15 {
	
	public static void main(String[] args) {
		//형 변환 type casting
		//숫자형 변수타입 간의 형변환
		//정수형 int(4) long(8) short(2) byte(1)
		//실수형 float(4) double(8)
		//형변환시킬때 : 작은 정수형 -> 큰 정수형 (문제없음)
		//               큰 정수 -> 작은 정수형 (범위를 넘으면 잘림)
		//               실수형 -> 정수형 (소수점이 날라감) 3.14 -> 3
		//               정수형 -> 실수형 (문제없음)  3 -> 3.0
		short s = 10;
		int i = (int)s; //(타입) : 형변환 연산자
		System.out.println( i );
		i = 1000;
		byte b = (byte)i;  //byte : -128~+127
		System.out.println( b ); //쓰레기 - 무용지물
		float f = 3.14f;
		i = (int)f;
		System.out.println( i ); //소숫점 값이 날아감 - 버림 연산 효과  ( 반올림, 버림, 올림 )
		i = 20;
		f = (float)i;
		System.out.println( f ); //20.0
		//문자열 타입 : String(가변형 ~ 메모리양)
		//문자 타입 : char(1~2)
		char c = 'a'; //아스키코드표, 완성형코드표, 유니코드코드표에 의해 숫자로 들어간다.
		              //이미지, 동영상, 문자, 음원 => 숫자(이진수)
		//char -> int
		int k = (int)c;
		System.out.println( k );
		//int -> char
		k = 42; //*
		c = (char)k;
		System.out.println( c );

		//연습문제
				//아스키코드표를 참조하여
				//1.대문자 'X'를 정수형 값으로 출력하세요.
				char X = 'X';
				System.out.println((int)X);
				//2.97 정수형 변수를 이용하여, 소문자 'a'를 출력하시오.
				System.out.println((char)97);
				//3.71 79 79 68 정수값을 이용하여,
				//  G O O D를 출력하시오.
				System.out.println((char)71+""+(char)79+""+(char)79+""+(char)68);
				
	}
}