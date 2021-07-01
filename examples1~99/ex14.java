package examples;
public class ex14 {
	public static void main(String[] args) {
		//진수 표현법
		//십진수 : 0 1 2   3    4   5  ... 8 9   10 11 12 13 14   15 16 17
		//이진수 : 0 1 10  11 100 101          1010             1111
		//팔진수 : 0 1 2   3           7  10
		//16진수 : 0 1 ...                   9    a  b  c  d  e    f 10
		//2진수
		int i = 15;
		String binaryString = Integer.toBinaryString(i);
		System.out.println( binaryString );
		//8진수 
		String octalString = Integer.toOctalString(i);
		System.out.println( octalString );
		//16진수
		String hexString = Integer.toHexString(i);
		System.out.println( hexString );
	}
}