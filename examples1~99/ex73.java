package examples;
	//��������
	//���忡 ����� Ű��� ������ ������.
	//���� Farm Ŭ������ �����,
	//�� �ȿ� ���� ����� ������ ��� ������ ���� carrot�� �����,
	//����� �����ϴ� �޼ҵ� plant()�� ȣ���ϸ�,
	//����� �ϳ��� �� �����մϴ�.
	//plant()�޼ҵ带 �̿��Ͽ� 5�� ȣ���Ͽ� ����� ������ ���ô�.
	//�������� ����� ������ ����Ͻÿ�.
class Farm {
	int cattot = 0;
	void plant() {
		cattot ++;
	}
}
public class ex73 {
	public static void main(String[] args) {
		Farm objFarm1 = new Farm();
		System.out.println("��ٳ���1 ����� ������ " + objFarm1.cattot);
		objFarm1.plant();
		objFarm1.plant();
		objFarm1.plant();
		objFarm1.plant();
		objFarm1.plant();
		System.out.println("��ٳ���1 ����� ������ " + objFarm1.cattot);
		Farm objFarm2 = new Farm();
		System.out.println("��ٳ���2 ����� ������ " + objFarm2.cattot);
		objFarm2.plant();
		System.out.println("��ٳ���2 ����� ������ " + objFarm2.cattot);
	}
}