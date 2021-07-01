package examples;


//싱글톤(Singleton) : 메모리상의 유일한 객체를 의미함.

class Ring { //일반 반지 - 여러개로 복제 가능
}
class KingRing { //절대 반지 - 유일한 객체
	private static KingRing singleton = new KingRing();
	//생성자함수
	public KingRing() {
		System.out.println("유일 반지가 생성되었습니다.");
	}
	//getter
	static KingRing getInstance() {
		return singleton;
	}
}
public class ex76 {
	public static void main(String[] args) {
		Ring ring1 = new Ring();
		Ring ring2 = new Ring();
		Ring ring3 = new Ring();
		System.out.println( ring1 );//15db9742
		System.out.println( ring2 );//6d06d69c
		System.out.println( ring3 );//7852e922
		//싱글톤 사용
		KingRing kingring1 = KingRing.getInstance();//4e25154f
		System.out.println( kingring1 );
		KingRing kingring2 = KingRing.getInstance();//4e25154f
		System.out.println( kingring2 );
	}
}