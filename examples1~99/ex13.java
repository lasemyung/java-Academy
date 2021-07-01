package examples;
public class ex13 {
	public static void main(String[] args) {
		// 숫자형 변수 타입
		// 정수형
		// int 4byte  long 8   short 2   byte 1
		// 실수형 
		// float   4
		// double  8
		// byte바이트 bit비트 ?
		// 1bit :   0/1 둘중 하나
		// 8bit :   1byte
		// 1byte : 1024 byte  (2의 8승: 2*2*2*2*2*2*2*2 = 1024)
		// 1kb : 1024kbyte
		// 1mb : 1024mbyte
		// 1gb : 1024gbyte
		// 1tb 
		int numInt = 32767; //정수형 4바이트 : 몇비트? 32비트 : 자릿수 2^32승 
		System.out.println(Integer.MIN_VALUE); // -2147483648
		System.out.println(Integer.MAX_VALUE); // 2147483647
		long numLong = 32700000067L; //L은 Long형 변수 값을 의미함.
		System.out.println(Long.MIN_VALUE); 
		System.out.println(Long.MAX_VALUE); 
		short numShort = 127; //2byte : 2^16승
		System.out.println(Short.MIN_VALUE);  //-32768
		System.out.println(Short.MAX_VALUE);  //32767
		byte numByte = 127; //1byte : 2*8승
		System.out.println(Byte.MIN_VALUE); 
		System.out.println(Byte.MAX_VALUE);
		//numByte = 300; -128 ~ +127 범위를 지켜야 됨.
		float f = 3.141592f; //실수형 (4바이트) : 근사값을 넣는다. 실수부,지수부
		System.out.println(Float.MIN_VALUE); 
		System.out.println(Float.MAX_VALUE);
		double d = 29.123456789; //실수형 (8바이트)
		System.out.println(Double.MIN_VALUE); 
		System.out.println(Double.MAX_VALUE);
	}
}