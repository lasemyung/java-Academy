package examples;

public class ex44 {

	public static void main(String[] args) {
//		2중 for문
//		for문안에 for문이 들어가는 경우 (3dpeth이상 피하는게)
		for( int i=0; i<10; i++) {
			for( int j=0; j<10; j++) {
				System.out.println(i + "," + j);
			}
		}
	}

}
