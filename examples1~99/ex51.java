package examples;

import java.util.Random;

public class ex51 {

	public static void main(String[] args) {
		
	Random rand = new Random();
	while ( true ) {
		int dice = rand.nextInt(6)+1;
		System.out.println( dice );
		if ( dice == 6) {
			break;
		}
	}

	
	while ( true ) {
		int dice1 = rand.nextInt(6)+1;
		int dice2 = rand.nextInt(6)+1;
		System.out.println( dice1 + ":" + dice2 );
		if ( dice1 == dice2) {
			break;
		}
	}
	}

}
