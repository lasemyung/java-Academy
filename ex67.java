package examples;

import java.util.Scanner;

public class ex67 {

	// 연습문제
	// 자판기 프로그램을 만들어보자
	// 메소드이름은 vendingMachine
	// 매개변수로
	// 1000원을 넣으면, "포카리스웨트"를 출력해주고,
	// 2000원을 넣으면, "컨디션"
	// 3000원을 넣으면, "몬스터"를 출력해주는 메소드를 만들자.
	// 반환값은 없음.

	static void vending(int money ) {
			if ( money == 1000) {
				System.out.println("포카리 스웨트");
			} else if ( money == 2000) {
				System.out.println("컨디션");
			}	else if ( money == 3000) {
				System.out.println("몬스터");
			}
	}
	public static void main(String[] args) {
			vending(1000);
			vending(2000);
			vending(3000);
	
	}
}
