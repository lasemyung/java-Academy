package examples;

//���� ���� Ű����
//public : �ٸ� Ŭ����(����)���� ���� ����(read/write)
//protected : ��Ӱ����� Ŭ���������� ���� ���� + ���� ��Ű�� ����
//default(����) : ���� ��Ű����(����)������ ���� ����
//private : �ٸ� Ŭ�������� ���� �Ұ� - ĸ��ȭ, ����
//Ŭ����, �Լ�(�޼ҵ�), ���� �տ� ���.

class Access {
	String name = "ȫ�浿"; //����Ʈ
	public int age = 30; //����
	protected int korScore = 80; //��Ӱ���
	private int engScore = 70; //���� �Ұ� - ���� - ĸ��ȭ
	
	//Getter�Լ� : ��������� �ܺο��� ���ٰ����ϵ��� �������ִ� �Լ�.
	public int getEngScore() {
		return engScore;
	}
	
	//Setter�Լ� : ��������� �ܺο��� ���ٰ����ϵ��� �������ִ� �Լ�.
	public void setEngScore(int engScore) {
		//this�� �ڱ� Ŭ������ �ǹ�
		this.engScore = engScore;
	}
}
public class ex74 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}