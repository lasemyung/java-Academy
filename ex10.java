package examples;

public class ex10 {

	public static void main(String[] args) {
//		형변환 type casting
//		문자열형(String) -> 숫자형 ( 정수형 int)
//		숫자형 -> 문자열형(String)
		
//		정수형을 문자열형으로 바꾸기
		int numInt = Integer.parseInt("123");
		System.out.println( numInt );
		
//		문자열형을 정수형으로 바꾸기
		String strInt = String.valueOf( numInt );
		System.out.println( strInt );
	}

}
