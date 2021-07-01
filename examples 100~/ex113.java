package examples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ex113 {

	public static void main(String[] args) {

		// 두 날짜간의 차이 구하기(D-day)
		// 7월 5일에 고객 이벤트를 시작한다.
		// 7월 1일이므로 "D-5일입니다"입니다. 출력하시오.

		Date now = new Date();
		System.out.println(now.getTime());

		// getTime() : timeStamp 정수값을 구한다.
		// 시간은 여러단위로 되어 있어서 불편 - 년월일시분초
		// 시간을 정수하나로 표현.
		// 1970년 1월 1일 0시 0분 0초를 기준으로 해서
		// 그이전이면 -정수, 그후면 +정수(1625111357706) 단위 밀리세컨드.
		// 유닉스OS, C언어때 설계됨.

		String startDay = "2021-07-01";
		String endDay = "2021-07-06";

		try {
			SimpleDateFormat sf = new SimpleDateFormat("yyy-MM-dd");
			// 문자열로부터 시간을 설정할 수 있다.
			Date startDate = sf.parse(startDay);
			Date endDate = sf.parse(endDay);

			// 시간차가 정수값(밀리세컨드)으로 나옴
			long diff = endDate.getTime() - startDate.getTime();

			long diffDay = diff / (24 * 60 * 60 * 1000);
			System.out.println("D-" + diffDay);
		} catch (Exception e) {
		}
	}

}
