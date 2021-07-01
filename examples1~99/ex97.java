package examples;

// Stringbuffer 문자열을 좀더 유연하게 처리하는 클래스
// 				: 추가(append),삽입(insert),삭제(delete)

public class ex97 {

	public static void main(String[] args) {

		// 문자열형 String에서 추가 + 연산자

		StringBuffer sb = new StringBuffer("abc");
		sb.append("def");
		System.out.println(sb);

		sb.insert(5, "___");
		System.out.println(sb);

		sb.delete(10, 12);
		System.out.println(sb);

	}

}
