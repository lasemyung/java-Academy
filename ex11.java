package examples;

import java.util.Scanner;
//별표 *의 의미 : java폴더 밑의 util폴더 밑의 모든 클래스를 참조한다.
//              : 검사한 후에 실제 사용하는 클래스만 소스에 포함시킴.
import java.util.*;

//jdk 개발 문서 : https://docs.oracle.com/javase/8/docs/api/
public class ex11 {
	public static void main(String[] args) {
		// 연습문제 - DM제출
		// 1번
		// Scanner함수를 통해 숫자문자열을 입력받아1
		// 정수형 변수 a를 형변환후 대입한 후에 출력하시오.
		Scanner scan = new Scanner(System.in);
		String strNum = scan.nextLine();
		int a = Integer.parseInt(strNum);
		System.out.println(a);
		// 2번
		// 자신의 이름을 영문으로 입력하고,
		// 출력해보세요.
		String name = scan.nextLine();
		System.out.println(name);
		// 3번
		// Scanner를 통해 정수 2개를 입력받고,
		// 덧셈과 뺄셈의 결과를 출력하세요.
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("덧셈:" + (num1 + num2));
		System.out.println("뺄셈:" + (num1 - num2));
	}
}

