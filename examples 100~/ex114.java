package examples;

import java.util.Calendar;

public class ex114 {

	public static void main(String[] args) {

		// 두날짜 사이의 차이를 구하기(DDay)
		// 자동으로 그레고리력으로 가져옴.(언어설정)

		Calendar startCal = Calendar.getInstance();
		Calendar endCal = Calendar.getInstance();
		startCal.set(2021, 6, 1);// 0은 1월
		endCal.set(2021, 6, 6);

		// startCal.setTime(new Date()); //현재시간으로 설정

		startCal.set(2021, 6, 1);
		endCal.set(2021, 11, 25);

		try {
			long diff = endCal.getTimeInMillis() - startCal.getTimeInMillis();
			long diffDays = diff / (24 * 60 * 60 * 1000);
			System.out.println("이벤트 데이까지 " + diffDays + "일 남았습니다!");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 연습문제 - DM으로 제출
		// 회사에서 2021년 12월 25일 성탄절 기념으로 이벤트를 하려고 한다.
		// 오늘 날짜기준으로 7월 1일까지 며칠이 남았는지 출력하시오.
		// 출력형식 : "이벤트데이까지 *일 남았습니다!"

	}
}