package examples;

public class ex65 {
	public static void main(String[] args) {
		
		// �Լ� �ȿ��� �Լ��� ������ �� ����!
		// �Լ��� 4���� ����
		// 1. �Ű����� X, ��ȯ�� X
		func1();
		// 2. �Ű����� O, ��ȯ�� X
		func2(20);
		// 3. �Ű����� X, ��ȯ�� O
//		int result = func3();
		System.out.println("��ȯ��:" + result);
		// 4. �Ű����� O, ��ȯ�� O
		result = func4(20);
		System.out.println("��ȯ��:" + result);
	}

	// static ����� : ���� ����(�Լ�)�� �����ϰ�,
	// ���޸𸮿� ����ɶ�, ������ �޸�(static)�� �ö󰡰�,
	// �� �ּҿ� ���α׷�����ñ��� ������ �ּҿ� �ӹ���.
	// static �Լ����� static�Լ��� ȣ�Ⱑ���ϴ�.
	// void ��ȯ���� ���ٴ� ��
	
	static void func1() {
		System.out.println("func1() ȣ���");
		return;
	}

	static void func2(int param) {
		System.out.println("func2() ȣ��� : " + param);
		return;
	}

	static int func3() {
		System.out.println("func3() ȣ���");
		return 10;
	}

	static int func4(int param) {
		System.out.println("func4() ȣ��� : " + param);
		return param;
	}
}