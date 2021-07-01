package examples;
public class ex03 {
	//실행 단축키 : CTRL + F11
		
	public static void main(String[] args) {
		//출력문
		System.out.println("Java Programming!");
		//System.out.println 단축키
		//sysout + CTRL+SPACE키
		System.out.println("is Good!");
		
		//문자열 연결 연산자 + : 좌,우항에 문자열이 하나라도 있으면
		System.out.println("Java" + 123);
		System.out.println(123 + "Java");
		System.out.println(123 + 10); //산술연산
		
		System.out.println(); //출력이 없음. 줄바꿈만 됨.
		
		//println문 : print line - 출력후 줄바꿈 한다.
		//print문 : print - 줄바꿈 없음
		//printf문 : format형(형식화된) 출력문 - 줄바꿈없음
		//         : C언어 스타일
		
		System.out.print("Tomorrow");
		System.out.print("will be rainning!");
		
		System.out.println(); //출력이 없음. 줄바꿈만 됨.
		
		System.out.printf("%d", 10); //decimal 십진수 정수 포맷
		// "\n" : 줄바꿈문자
		System.out.printf("%d\n", 20);
		System.out.printf("%d\n", 30);
		
		//연습문제
		// 다음과 같이 출력하시오.
		// 1. "Coding is Good!"
		System.out.println("Coding is Good!");
		// 2. "Java"문자와 "Programming"문자를  +연결연산자로 연결해서 출력하시오.
		System.out.println("Java" + " Programming");
		// 3. 십진 정수 123을 printf를 이용하여 출력하시오.
		System.out.printf("%d", 123);
		
	}
}