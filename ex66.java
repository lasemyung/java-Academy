package examples;

public class ex66 {
	// ��������
	// 1.
	// sum�̶�� �޼ҵ带 �ϳ� ������
	// �� �޼ҵ�� ���� 2���� �Ű������� �ް�,
	// �� �� ������ �ջ��ؼ�, ��ȯ������ �����ϴ� �޼ҵ��̴�.
	// ��°�: 10�� 20�� �ջ��� 30
	
	static int sum (int param1, int param2) {
		return param1 + param2;
	}
	
	// 2.
	// String�� �Ű������� �޴� �޼ҵ� echo�� �����ϰ�,
	// �� String ���ڿ��� ����ϴ� �޼ҵ带 ȣ���ϼ���.
	// ��ȯ���� ����
	// ��°�: "�ڹ� ���α׷���!"
		
		static void echo ( String message ) {
			System.out.println(message);
			return;
		}
	
	public static void main(String[] args) {
		
		int result = sum ( 10, 20);
		System.out.println(result);
		
		echo("�ڹ� ���α׷���!");

	}
}