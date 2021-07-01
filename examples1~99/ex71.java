package examples;

class Cafe {
//	속성
	int menu_count = 10;
//	행동
	void sell() {
		System.out.println("커피를 판다");
	}
}


public class ex71 {

	public static void main(String[] args) {
//		객체 생성
		Cafe subCafe = new Cafe();
		
//		출력
		System.out.println(subCafe.menu_count);
		subCafe.sell();
	}

}
