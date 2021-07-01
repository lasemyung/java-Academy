package examples;

public class ex106 {

	public static void main(String[] args) {
		
		try {
			int countToy = 5;
			
			if ( countToy > 3) { //값이 이상하다?
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("장난감의 갯수가 3을 넘어섰음");
			e.printStackTrace();
		}
	}

}
