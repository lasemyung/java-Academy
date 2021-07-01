package examples;

public class ex55 {
//					   정수 0      1        2
	public enum Hero { Ironman, Superman, Batman };
	
	public static void main(String[] args) {
		
//		열거형 enum
		
//		숫자로 값을 정의하기 보다는 문자로 정의하기 위해서
//		가위 -> 0 / 바위 -> 1 / 보 -> 2
		
		
		System.out.println ( Hero.Ironman);
		System.out.println ( Hero.Superman);
		System.out.println ( Hero.Batman);
		
		System.out.println ( Hero.Ironman.ordinal());
		System.out.println ( Hero.Superman.ordinal());
		System.out.println ( Hero.Batman.ordinal());
		
//		열거형 변수를 선언하자
		Hero myHero = Hero.Ironman;
		System.out.println ( myHero);
		myHero = Hero.Superman;
		System.out.println (myHero);
		
		switch (myHero) {
		case Ironman:
			System.out.println ( "아이언맨");
			break;
		case Superman:
			System.out.println ( "슈퍼맨");
			break;
		}
		if ( myHero == Hero.Superman) {
			System.out.println ( "슈퍼맨");
		}
	}

}
