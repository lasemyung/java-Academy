package examples;

public class ex69 {
			
//	�޼ҵ� �����ε� ( Over loading):
//	�Ű� ������ �ٸ� �Լ�
	
	static void echo() {
		System.out.println("echo() �Ű���������");
	}
	
	static void echo(String message) {
		System.out.println("echo()" + message);
	}
	
	static void echo(int number) {
		System.out.println("echo()" + number);
	}
	
	public static void main(String[] args) {
		
		echo ();
		echo("����!");
		echo(10);
		
//	 system.out.println �Լ��� Ȯ��(�����ε�)�� �Ǵ� �Լ��̴�.
		
	}

}
