package examples;

//������ �Լ� : ��ü�� ������ ��(new) �ڵ����� ȣ��Ǵ� �Լ�
//        �뵵: �ʱ�ȭ(�̸� ������ �ڵ�)

class Book {
	int price = 1000;
	public void read() {
		System.out.println("å���д´�");
	}
	//������ �Լ� - �ڵ�ȣ��
	//���� 
	//public ��ȯ������ Ŭ�����̸�()
	public Book() {
		System.out.println("�������Լ� ȣ���.");
		this.price = 2000;
	}
}
public class ex79 {
	public static void main(String[] args) {
		Book book = new Book();
		System.out.println( book.price );
	}
}