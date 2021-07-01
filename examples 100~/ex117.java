package examples;

import java.util.ArrayList;

//클래스객체 ArrayList에 넣는 연습문제
//몬스터를 여러개 만들어서 리스트에 넣어보자.
//1. "달걀몬스터"
//2. "햄스터몬스터"
//3. "헐크몬스터"의 이름으로 몬스터 객체를 만들어서
//4. monsters라는 Array List에 넣고,
//5. 전체 몬스터 객체 목록을 출력하시오.
//6. "햄스터몬스터"를 제거하고 "눈사람몬스터"를 그 자리에 넣으시오.

public class ex117 {

	public static void main(String[] args) {
		
		ArrayList<String> monsters = new ArrayList<String>();
		monsters.add("달걀몬스터");
		monsters.add("햄스터몬스터");
		monsters.add("헐크몬스터");
		System.out.println(monsters);
		
		monsters.remove(1);
		System.out.println(monsters);
		
		monsters.add(1, "눈사람몬스터");
		System.out.println(monsters);
	}

}
