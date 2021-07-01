package examples;

import java.util.Scanner;

public class ex17 {
	
	public static void main(String[] args) {
		//형변환
		//연습문제
		//1.float 3.14f 변수를 선언하고 초기화하고,
		//  정수형으로 출력하시오.
		
		float a = 3.14f;
		a = (int)a;
		System.out.println((int)a);
		
		//2. int형 12345 를 선언하고 초기화하고,
		//   실수형으로 출력하시오.
		
     	int b = 12345;
		double d = (double)b;
		System.out.println(d);

		//3.Scanner로 실수형 변수를 입력받고,
		//소숫점 첫째자리에서 반올림하여 출력하시오. 
		//소숫점 .5이하는 0으로 버림.
		//       .5이상은 1로 올림.
		//힌트 : 실수형을 정수형으로 형변환하면, 소숫점이 날아간다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력:");
		float num = scan.nextFloat();
		System.out.println( num );
		
		num = (int)num;
		System.out.println( num );
		
		//4. 소숫점 둘째자리에서 반올림하여 출력하시오. 
		//ex) 12.345f -> 12.3f
		//ex) 12.356f -> 12.4f
		//5. 소숫점 셋째자리에서 반올림하여 출력하시오.
		//힌트: 자릿수 만큼 곱한 것에 반올림 한다음 형변환-버림하고
		//      그리고 그 자릿수만큼 나누면 될 것 같네요
		
		float c = 6.143f;
		System.out.println(Math.round(c*100)/100.0);
		
	}
}