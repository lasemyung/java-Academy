package examples;

public class ex32 {

	public static void main(String[] args) {
//		연습문제
		
//		if else문
//		i값이 70 이상이면 " 70보다 같거나 큽니다.
//		70미만 이면 "70보다 작습니다. 를 출력하세요
		
	    int i = 73;
	    
	    if ( i >= 70) {
	    	System.out.println ( "70보다 같거나 큽니다.");
	    } else if ( i < 70 ) {
	    	System.out.println ( "70보다 작습니다.");
	    }
	    
//	    ------------------------------------------------
	    
	    if ( i > 90) {
	    	System.out.println ( "90이상입니다.");
	    } else if ( i > 80 ) {
	    	System.out.println ( "80이상입니다.");
	    } else if ( i > 70) {
	    	System.out.println ( "70이상입니다.");
	    } else {
	    	System.out.println ( "그외의 수입니다.");
	    }
	}

}
