package examples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ex110 {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println( date );
		
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyy/MM/dd");
		
		String dateFormat = sdf.format(date);
		System.out.println( dateFormat );
		
		//H: 24시간
		//h: 오전 오후 12 시간
		SimpleDateFormat sdf2 =
				new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
		
		String dateFormat2 = sdf2.format(date);
		System.out.println( dateFormat2 );
		
		SimpleDateFormat sdf3 =
				new SimpleDateFormat("yyy년/MM월/dd일 HH시:mm분:ss분");
		
		String dateFormat3 = sdf3.format(date);
		System.out.println( dateFormat3 );
	}

}

	