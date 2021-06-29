package examples;

public class ex49 {

	public static void main(String[] args) {
//		-------------------------------------------
		int i = 1;
		while ( i <= 100 ) {
			if ( i % 7 == 0) {
			System.out.println ( i );}
			i ++;
		}
//		-------------------------------------------
		
		 int sum = 0; 
         int j = 1;
         while(j <= 100){
             sum = sum + j;
             j++;
         }
         System.out.println ( "1~100까지 합 : " + sum );
//      ---------------------------------------------------
        
         int count = 0;
 		int div_count = 0;
 		i=1;
 		while( i<=100 ) {
 			div_count = 0;
 			for( int j=1; j<=i; j++ ) {
 				if( i%j == 0 ) {
 					div_count++;
 				}
 			}
 			if( div_count == 2 ) {
 				System.out.println("소수: " + i);
 				count++;
 			}
 			i++;
 		}
 		System.out.println( "소수의 갯수:" + count);
         }
         
         
	}

}
