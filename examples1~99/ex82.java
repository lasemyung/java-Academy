package examples;

//�⺻������,�Ű����������ڿ���
//��Ӱ��迡���� �����ڿ� ���ؼ�
class Energy {
	int price = 1000;

	public Energy() {
		System.out.println("Energy �⺻������");
	}

	public Energy(int price) {
		System.out.println("Energy �Ű����� ������:" + price);
		this.price = price;
	}
}

class WindEnergy extends Energy {
	int price = 2000;

	public WindEnergy() {
		System.out.println("WindEnergy �⺻������");
	}

	public WindEnergy(int price) {
		System.out.println("WindEnergy �Ű����� ������:" + price);
		this.price = price;
	}
}

public class ex82 {
	public static void main(String[] args) {
		WindEnergy wind = new WindEnergy();
		WindEnergy wind2 = new WindEnergy(2500);
	}
}