package examples;

public class ex07 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println(x);
		System.out.println(y);
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println( x );
		System.out.println( y );
	}

}
