package examples;

import java.util.Random;

public class ex58 {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		int[] nums1 = { 10, 20, 30, 40, 50, 60 ,70 ,80, 90, 100};
		
		for ( int i=0; i<nums1.length; i++) {
			System.out.println (nums1[i]);
		}
//--------------------------------------------------------------------
		
	int[] lotto = new int[6];
	Random rand = new Random();
		for( int i=0; i<6; i++) {
			lotto[i] = rand.nextInt(45) +1;
			System.out.println ( lotto[i]);
			
	
		}

		
	}

}
