package examples;

class Cafe {
//	�Ӽ�
	int menu_count = 10;
//	�ൿ
	void sell() {
		System.out.println("Ŀ�Ǹ� �Ǵ�");
	}
}


public class ex71 {

	public static void main(String[] args) {
//		��ü ����
		Cafe subCafe = new Cafe();
		
//		���
		System.out.println(subCafe.menu_count);
		subCafe.sell();
	}

}
