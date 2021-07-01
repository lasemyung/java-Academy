package examples;
import java.util.Scanner;
public class ex09 {
	public static void main(String[] args) {
		// next() : 문자열입력, 공백(스페이스)까지만 입력받음. "i am a boy"엔터 -> "i"
		// nextLine() : 문자열입력, 공백포함 한줄모두 입력받음. "i am a boy"엔터 -> "i am a boy"
		// nextInt() : 문자열을 입력받아서 정수(int)로 반환해 줌
		// nextFloat() : 문자열을 입력받아서 실수(float)로 반환해 줌
		// chartAt(index) : 문자열에서 index(0부터 시작함)에 해당하는 문자한자(char)만 가져옴.
		//                : char형으로 반환
		Scanner scan = new Scanner(System.in);
		System.out.println("nextLine() 입력:");
		String msg1 = scan.nextLine();
		System.out.println( msg1 );
		System.out.println("next() 입력:");
		String msg2 = scan.next();
		System.out.println( msg2 );
		scan.nextLine(); //scan객체가 가지고 있던 데이타를 지워줌.
		System.out.println("nextInt() 입력:");
		int num1 = scan.nextInt();
		System.out.println( num1 );
		System.out.println("nextFloat() 입력:");
		float num2 = scan.nextFloat();
		System.out.println( num2 );
		scan.nextLine(); //buffer clear
		char ch = scan.nextLine().charAt(0); //문자열의 첫 문자만 가져옴. char형으로 
		System.out.println( ch );
	}
}
