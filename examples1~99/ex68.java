package examples;

public class ex68 {
			
	//��������
	//�ڵ��� �������� ����Լ��� ����� ����
	//�Լ��̸�: carPrice
	// �ڵ��� �̸��� �Ű������� ������, ������ ��ȯ�ϴ�
	// �޼ҵ带 ������ ����.
	// "���"  => 1000   => "����� 1000�����Դϴ�."
	// "��Ÿ��"  => 2000   => "��Ÿ���� 2000�����Դϴ�."
	// "BMW"   => 3000   => "BMW�� 3000�����Դϴ�."
	// "����" => 4000    => "������ 4000�����Դϴ�."

	static void carPrice(String carName ) {
		if ( carName == ( "���")) { 
			System.out.println("����� 2000�����Դϴ�.");
		} else if ( carName == "��Ÿ��" ) {
			System.out.println("��Ÿ���� 2000�����Դϴ�.");
		}	else if ( carName == "BMW" ) {
			System.out.println("BMW�� 3000�����Դϴ�.");
		}   else if ( carName == "����" ) {
			System.out.println("������ 4000���� �Դϴ�.");
		}	else {
			retrun 0;
		}
}
		
//	static int carPrice( String carName ) {
//		if( carName.equals("���") ) {
//			return 1000;
//		}
//		else if( carName.equals("��Ÿ��") ) {
//			return 2000;
//		}
//		else if( carName.equals("BMW") ) {
//			return 3000;
//		}
//		else if( carName.equals("����") ) {
//			return 4000;
//		}
//		else {
//			return 0;
//		}
//	}   
//		
	public static void main(String[] args) {
		
		carPrice("���");
		carPrice("��Ÿ��");
		carPrice("BMW");
		carPrice("����");
			
//		int price = carPrice("���"); //����� ���
//		System.out.println( "����� ������ " + price + "�Դϴ�.");
	}

}
