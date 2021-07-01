package examples;

public class ex22 {
	
	public static void main(String[] args) {
		
		// 비트단위 연산자
		// 쉬프트 연산자  <<  >>   >>>
		// << >> 산술적 비트이동
		// i << n : n자릿수만큼 왼쪽으로 비트이동 *2^n 효과 - 산술
		// i >> n : n자릿수만큼 오른쪽으로 비트이동 /2^n 효과 - 산술
		int i = 1;  //이진수: 000........0001  1
		i = i << 1; //        000........0010  2
		System.out.println( i );
		i = i << 1; //        000........0100  4
		System.out.println( i );
		i = i << 1; //        000........1000  8
		System.out.println( i );
		i = 8;      //이진수: 000........1000  8
		i = i >> 1; //        000........0100  4
		System.out.println( i );
		i = i >> 2; //        000........0001  1
		int k = -1;  //이진수 : 100........0001 이렇게 표현하지 않음
		             //2의 보수로 표현 : 1의 보수 + 1
		             //1의 보수 0->1, 1->0
		//00000000000001
		//11111111111110  1의 보수
		//11111111111111  +1 => 2의 보수
		System.out.println( Integer.toBinaryString(k) );
		k = k >> 1;
		// 11111111111111
		System.out.println( k );
		System.out.println( Integer.toBinaryString(k) );
		// >>>연산자 : 논리적 비트이동
		//            음수든 양수든 왼쪽이 무조건 0으로 진입
		k = k >>> 1;
		System.out.println( Integer.toBinaryString(k) );
	}
}