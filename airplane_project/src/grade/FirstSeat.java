package grade;

public class FirstSeat implements SeatType {

	@Override
	public String getSeat(int seatnum) {
		String m;
		
		if(0 < seatnum && seatnum <= 2) {
			m = "1열입니다.";
		}else if (3 <= seatnum && seatnum <= 4) {
			m = "2열입니다.";
		}else if (5 <= seatnum && seatnum <= 6) {
			m = "3열입니다.";
		}else {
			m = "잘못된 입력입니다.";}
		return m;		
	}
	
	public String getPrice(int seatnum) {
		String p = null;
	
		if (0 < seatnum && seatnum <= 2) {
			p = "1500000원";
		} else if (3 <= seatnum && seatnum <= 4) {
			p =  "1300000원";
		} else if (5 <= seatnum && seatnum <= 6) {
			p =  "1000000원";
		}
		
		return p;
	}

}
