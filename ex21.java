package examples;

public class ex21 {

	public static void main(String[] args) {
//		비트단위 연산자
//		~연산자 : 비트반전 연산자
//		0->1 , 1->0
		
		int i = 11;
//		이진수 : 1011
		System.out.println( Integer.toBinaryString(i));
		
		i = ~i; // 00000000000......0001011
				// 11111111111......1110100
		System.out.println( Integer.toBinaryString(i));
	}

}
