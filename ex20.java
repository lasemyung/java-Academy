package examples;

public class ex20 {
	
	public static void main(String[] args) {
		// 앞++, 뒷++ 연산자의 차이
		
		int i = 10;
		
		// 앞++ : 먼저 연산이 수행되고, 그 다음 처리(출력)
		// 뒷++ : 뒤에 연산이 수행됨. 먼저 출력이 되어 버림
		
		System.out.println( i++ ); //10  //라인이 넘어가면서 +1
		System.out.println( ++i ); //12  //모든 연산보다 먼저 +1
		System.out.println( i );  //12
		
		//앞++, 뒷++ 혼용해서 사용하지 말것
		
		System.out.println( i++ * i-- / ++i );
		//헷갈리게 하지 말자
		
		i++;
		System.out.println( i );
		++i;
		System.out.println( i );
		
		//컴파일 전에, 출력결과를 예측해보세요.
		
		i = 10;
		System.out.println( --i );  //9
		System.out.println( i-- );  //9
		System.out.println( i );    //8
	}
}