package examples;

import java.util.Scanner;

public class ex67 {

	// ��������
	// ���Ǳ� ���α׷��� ������
	// �޼ҵ��̸��� vendingMachine
	// �Ű�������
	// 1000���� ������, "��ī������Ʈ"�� ������ְ�,
	// 2000���� ������, "�����"
	// 3000���� ������, "����"�� ������ִ� �޼ҵ带 ������.
	// ��ȯ���� ����.

	static void vending(int money ) {
			if ( money == 1000) {
				System.out.println("��ī�� ����Ʈ");
			} else if ( money == 2000) {
				System.out.println("�����");
			}	else if ( money == 3000) {
				System.out.println("����");
			}
	}
	public static void main(String[] args) {
			vending(1000);
			vending(2000);
			vending(3000);
	
	}
}
