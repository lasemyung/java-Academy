package examples;

 import java.util.Random;

public class ex62 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int[][] nums = new int[3][3];
		
		for ( int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[i].length; j++) {
				nums[i][j] = rand.nextInt(100)+1;
				System.out.println ( nums[i][j] );
			}
		}
			
			
			
	}

}
