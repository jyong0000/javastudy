package grade;

public class EconomySeat implements SeatType{

	@Override
	public String getSeat(int seatnum) {
		String m;
		String price;
		
		if(0<seatnum && seatnum <= 4) {
			m = "1열입니다.";
			price = "500000원";
		}else if (5 <= seatnum && seatnum <= 8) {
			m = "2열입니다.";
			price = "470000원";
		}else if (9 <= seatnum && seatnum <= 12) {
			m = "3열입니다.";
			price = "450000원";
		}else if (13<= seatnum && seatnum <= 16) {
			m = "4열입니다.";
			price = "430000원";
		}else {
			m = "잘못된 입력입니다.";
		}
		return m;
	}

	@Override
	public String getPrice(int seatnum) {
		String price = null;
		
		if(0<seatnum && seatnum <= 4) {
			price = "500000원";
		}else if (5 <= seatnum && seatnum <= 8) {
			price = "470000원";
		}else if (9 <= seatnum && seatnum <= 12) {
			price = "450000원";
		}else if (13<= seatnum && seatnum <= 16) {
			price = "430000원";
	}
		return price;
		
	}
	
}

