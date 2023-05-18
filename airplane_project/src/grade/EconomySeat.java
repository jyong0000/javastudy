package grade;

public class EconomySeat implements SeatType{

	@Override
	public String getSeat(int seatnum) {
		String m;
		
		if(0<seatnum && seatnum <= 4) {
			m = "1열입니다.";
		}else if (5 <= seatnum && seatnum <= 8) {
			m = "2열입니다.";
		}else if (9 <= seatnum && seatnum <= 12) {
			m = "3열입니다.";
		}else if (13<= seatnum && seatnum <= 16) {
			m = "4열입니다.";
		}else {
			m = "잘못된 입력입니다.";
		}
		return m;
	}

	 public String getPrice(int seatnum) {
		 String p = null;
		 
	            if (0 < seatnum && seatnum <= 4) {
	            	 p = "500000원";
	            } else if (5 <= seatnum && seatnum <= 8) {
	            	 p =  "470000원";
	            } else if (9 <= seatnum && seatnum <= 12) {
	            	 p =  "450000원";
	            } else if (13 <= seatnum && seatnum <= 16) {
	            	 p =  "430000원";
	            }
				return p;
	        
	    }
	

	
}