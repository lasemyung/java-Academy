package examples;


//�̱���(Singleton) : �޸𸮻��� ������ ��ü�� �ǹ���.

class Ring { //�Ϲ� ���� - �������� ���� ����
}
class KingRing { //���� ���� - ������ ��ü
	private static KingRing singleton = new KingRing();
	//�������Լ�
	public KingRing() {
		System.out.println("���� ������ �����Ǿ����ϴ�.");
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
		//�̱��� ���
		KingRing kingring1 = KingRing.getInstance();//4e25154f
		System.out.println( kingring1 );
		KingRing kingring2 = KingRing.getInstance();//4e25154f
		System.out.println( kingring2 );
	}
}