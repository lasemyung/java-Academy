package examples;

//��������
//Ŭ�����̸� : Robot
//�Ӽ� : color "����"
//�ൿ : walk
//������ �Լ� : color�� "���"���� �ٲ۴�.
//�������Լ� �� Ŭ������ ������ ��ü�����Ͻÿ�.

class Robot {
	String color = "����";

	public  void walk() {
		System.out.println("�ȴ´�");
	}

public  Robot() {
	System.out.println("�������Լ� ȣ���.");
	this.color = "���";
}
}

public class ex80 {

	public static void main(String[] args) {
		Robot robot = new Robot();
		System.out.println( robot.color );
		robot.walk();
	}

}
