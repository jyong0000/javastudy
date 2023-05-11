package grade;

public class FirstSeat implements SeatType {

	@Override
	public String getSeat(int seatnum) {
		String m;
		int price;
		
		if(0 < seatnum && seatnum <= 2) {
			m = "1열입니다.";
			price = 1500000;
		}else if (3 <= seatnum && seatnum <= 4) {
			m = "2열입니다.";
			price = 1300000;
		}else if (5 <= seatnum && seatnum <= 6) {
			m = "3열입니다.";
			price = 1000000;
		}else {
			m = "잘못된 입력입니다,";
		}
		return m;
	}
}
