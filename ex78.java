package examples;

class Wood {
	int price = 1000;

	void burn() {
		System.out.println("∫“≈∫¥Ÿ");
	}
}

class WoodDesk extends Wood {
	String color;

	void study() {

	}
}

class WoodChair extends Wood {
	String color;

	void sit() {

	}
}

public class ex78 {

	public static void main(String[] args) {

		WoodDesk objWoodDesk = new WoodDesk();
		System.out.println(objWoodDesk.price);
		objWoodDesk.burn();

		WoodChair objWoodCahir = new WoodChair();
		System.out.println(objWoodCahir.price);
		objWoodCahir.burn();
		
		
		
	}

}
