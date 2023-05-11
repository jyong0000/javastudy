package grade;

public class EconomySeat implements SeatType{

	@Override
	public String getSeat(int seatnum) {
		String m;
		int price;
		
		if(0<seatnum && seatnum <= 4) {
			m = "1열입니다.";
			price = 500000;
		}else if (5 <= seatnum && seatnum <= 8) {
			m = "2열입니다.";
			price = 470000;
		}else if (9 <= seatnum && seatnum <= 12) {
			m = "3열입니다.";
			price = 450000;
		}else if (13<= seatnum && seatnum <= 16) {
			m = "4열입니다.";
			price = 430000;
		}else {
			m = "잘못된 입력입니다.";
		}
		return m;
		
		
	}
}

