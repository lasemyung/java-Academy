package examples;

class Desk {
	private int Price = 1000; // Ä¸½¶È­

	public int getPrice() {
		return Price;
	}

	public void setPrice(int Price) {
		this.Price = Price;
	}

}

public class ex75 {

	public static void main(String[] args) {
		
		Desk obj = new Desk();
		
		System.out.println(obj.getPrice());
		obj.setPrice(2000);
		System.out.println(obj.getPrice());
	}

}
