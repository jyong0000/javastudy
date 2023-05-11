package grade;

public class FirstSeat implements SeatType {

	@Override
	public String getSeat(int seatnum) {
		String m;
		String price;
		
		if(0 < seatnum && seatnum <= 2) {
			m = "1열입니다.";
			price = "1500000원";
		}else if (3 <= seatnum && seatnum <= 4) {
			m = "2열입니다.";
			price = "1300000원";
		}else if (5 <= seatnum && seatnum <= 6) {
			m = "3열입니다.";
			price = "1000000원";
		}else {
			m = "잘못된 입력입니다,";}
		return m;
	}
		
		public String getPrice(int seatnum) {
			String price = null;
			
			if(0 < seatnum && seatnum <= 2) {
				price = "1500000원";
			}else if (3 <= seatnum && seatnum <= 4) {
				price = "1300000원";
			}else if (5 <= seatnum && seatnum <= 6) {
				price = "1000000원";
			}
		return price;
	}
}
