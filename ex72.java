package examples;
//����ƽ Ŭ���� static class
//����ƽ �Լ�/����
// ���α׷� ������ �ڵ����� �޸𸮿� ����(new)
//��ü���α׷����� �ڵ尡 �����ڵ��϶�, ������ ���̻� �ʿ������
//��ƿ��Ƽ �ڵ带 ����.
class BallFactory {
	static int amoutDay = 100;
	static void make() {
		System.out.println("�౸�� �����");
	}
}
class FoodFactory{
	int amoutDay = 200;
	void make() {
		System.out.println("���ö� �����");
	}
}
public class ex72 {
	public static void main(String[] args) {
		//Ŭ�����̸� �ڿ� ����� ���ٰ�����.
		System.out.println( BallFactory.amoutDay );
		BallFactory.make();
		FoodFactory obj1 = new FoodFactory();
		FoodFactory obj2 = new FoodFactory();
		FoodFactory obj3 = new FoodFactory();
	}
}