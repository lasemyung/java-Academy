package examples;

//연습문제
//클래스이름 : Robot
//속성 : color "빨강"
//행동 : walk
//생성자 함수 : color를 "흰색"으로 바꾼다.
//생성자함수 및 클래스를 설계후 객체생성하시오.

class Robot {
	String color = "빨강";

	public  void walk() {
		System.out.println("걷는다");
	}

public  Robot() {
	System.out.println("생성자함수 호출됨.");
	this.color = "흰색";
}
}

public class ex80 {

	public static void main(String[] args) {
		Robot robot = new Robot();
		System.out.println( robot.color );
		robot.walk();
	}

}
