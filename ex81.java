package examples;

//������ �Լ��� �Ű� ������ �༭ �ʱ�ȭ�� �� �� �ִ�

class Robot2 {
	String color = "����";
	
//	�⺻������
	public Robot2() {
		System.out.println("�⺻ ������ ȣ���");
	}
//	�Ű� ������ �ִ� ������
	public Robot2(String color) {
		System.out.println("�Ű� ������ �ִ� ������ ȣ���");
		this.color = color;
	}
}
public class ex81 {

	public static void main(String[] args) {
//		�⺻ �����ڸ� ���� ��ü ����
		Robot2 robot1 = new Robot2();
		System.out.println(robot1.color);
//		�Ű������� ���� ������ �Լ��� ���� ��ü ����
		Robot2 robot2 = new Robot2("�Ķ�");
		System.out.println(robot2.color);
	}

}
