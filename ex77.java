package examples;
//Ŭ������ ����
//1.���
//2.�������Լ�
//3.������(Override, �������̵�)  <-> �����ε�(Ȯ��)
//4.������
//5.�߻�ȭŬ����
//6.�������̽�
//7.�͸��Լ�-�������̽� �������̵�
//Ŭ������ ���
// : �θ�Ŭ������ �ڻ�(����,�Լ�)�� �ڳ�Ŭ�������� �����ִ� ��
class Animal {
	//�Ӽ�
	int age = 10;
	//�ൿ
	void eat() {
		System.out.println("�Դ´�");
	}
}
class Dog extends Animal { //������ - ������ �Ӽ��� ����
}
class Cat extends Animal { //����� - ������ �Ӽ��� ����
}
public class ex77 {
	public static void main(String[] args) {
		Dog  objDog = new Dog();
		System.out.println( objDog.age );
		objDog.eat();
		Cat objCat = new Cat();
		System.out.println( objCat.age );
		objCat.eat();
	}
}