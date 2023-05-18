package Q11_09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q9 {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 mm월 dd일 E요일 hh시 mm분" );
		System.out.println(sdf.format(now));
	}

}
