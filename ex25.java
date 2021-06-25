package examples;

public class ex25 {
	
	public static void main(String[] args) {
		
		// 논리 연산자
		// && and
		// || or
		//논리표
		
		// AND
		// T && T => T  둘다 Ture여야 True이다
		// T && F => F
		// F && T => F
		// F && F => F
		
		//OR
		// T || T => T  
		// T || F => T
		// F || T => T
		// F || F => F  둘다 False일때만 False
		
		//XOR  ^(비트 단위 연산자)
		// T ^ T => F
		// T ^ F => T  값이 같으면 F, 값이 다르면 T
		// F ^ T => T
		// F ^ F => F
		
		// NOT ! (논리반전),  ~(비트반전)
		// !T = F
		// !F = T
	}
}