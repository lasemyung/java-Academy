package examples;
	
//패키지 : 폴더(디렉토리)개념으로(경로) 클래스의 이름 중복을 피하기위해(namespace)
//C:\aaa\bbb\ccc\test.java
//패키지이름 : aaa.bbb.ccc.test

public class ex02 {
	//public : 접근제한자 예약어 : 공용-오픈
	//ex02 : 파일이름이면서 클래스이름 (파일이름과 클래스이름은 반드시! 동일해야 됨.)
	//class : 클래스 예약어
	
	public static void main(String[] args) {
		//프로그램 시작점(Entry Point) : 메인함수 
	    //static : 정적 클래스/함수/변수 - 프로그램시작시 특정메모리 주소에 지정/적재후 종료시까지 변경이 안됨.
	    //void : 함수 반환값이 없을 때 타입(형)
	    //main : 메인함수 이름	
	    //String[] args : 프로그램 실행시 들어오는 매개변수 문자열배열
	    //                 예) hwp.exe aaa.hwp bbb.hwp 엔터
	    //String[ ] : 문자열 배열
	    //args : 문자열 배열 이름
	    //주석문 Comment
	    //한줄 주석문 // 
	    /*
	     여러줄
	     주석문
	     */
		
		System.out.println("coding is good!");
		System.out.println("java" + " programming");
		System.out.printf("%d", 123);
		System.out.printf("%d", 20);
		System.out.printf("%d/n", 30);
		
		
		
	}

}
