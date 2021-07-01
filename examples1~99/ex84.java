package examples;

//다형성 (Polymorphism:폴리모피즘) - 자식클래스의 상속된 일부클래스만 가져올 수 있다.
//                  B클래스가 A를 상속했을때 B = A + B
//                  new객체로 된 상태에서 A만 가져오고 싶을때
class Parent {
	int parent_money = 1000;
}

class Child extends Parent {
	int child_money = 500;
}

public class ex84 {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.parent_money);
		System.out.println(child.child_money);
		// instanceof 연산자 :
		// 객체가 해당 클래스를 소유하고 있는지 검사(유전자검색)
		if (true == child instanceof Child) {
			System.out.println("Child클래스 소유함.");
		} else {
			System.out.println("Child클래스 소유하지 않음.");
		}
		if (true == child instanceof Parent) {
			System.out.println("Parent클래스 소유함.");
		} else {
			System.out.println("Parent클래스 소유하지 않음.");
		}
		// Child child2 = new Child();
		Parent parent_original = new Parent();
		if (true == parent_original instanceof Child) {
			System.out.println("Child클래스 소유함.");
		} else {
			System.out.println("Child클래스 소유하지 않음.");
		}
		if (true == parent_original instanceof Parent) {
			System.out.println("Parent클래스 소유함.");
		} else {
			System.out.println("Parent클래스 소유하지 않음.");
		}
		// 다형성을 사용하는 이유
		// 상속한 모든 클래스의 기능을 일부만 사용하고 싶을때
		Parent parent = new Child(); // Child+Parent => Parent
		System.out.println(parent.parent_money);
		// System.out.println( parent.child_money ); //소유하지 않음.
		// 다형성에서는 동작이 애매함.
		// 자식의 형상은 가지고 있으나 실제값은 없음.
		if (true == parent instanceof Child) {
			System.out.println("Child클래스 소유함.");
		} else {
			System.out.println("Child클래스 소유하지 않음.");
		}
		if (true == parent instanceof Parent) {
			System.out.println("Parent클래스 소유함.");
		} else {
			System.out.println("Parent클래스 소유하지 않음.");
		}
		// 클래스객체의 타입확인 : getName()
		// examples.Child
		System.out.println(parent.getClass().getName());
	}
}