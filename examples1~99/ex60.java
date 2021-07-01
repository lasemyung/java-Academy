package examples;

public class ex60 {
	
	public static void main(String[] args) {

		
		int[] numbers = { 12, 31, 48, 82, 29 };
		int temp = 0;
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<5; j++ ) {
				if( numbers[i] > numbers[j]) {
					//치환
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		for( int num : numbers ) {
			System.out.println( num );
		}
	}
}