package report;

import java.util.ArrayList;

import airplane.*;
import grade.*;
import utils.Define;

public class Report {
	Airplane airplane = Airplane.getInstance();
	
	public static final String TITLE = " 좌석 안내 \n";
	public static final String HEADER = "이름 | 승객번호 | 좌석 | 좌석번호 | 열   |  가격  | \n";
	public static final String LINE = "====================================================\n";
	private StringBuffer buffer = new StringBuffer();
	
	public String getReport() {
		ArrayList<Seat> seatList = airplane.getSeatList();
		
		for(Seat seat : seatList) {
			makeHeader(seat);
			makeBody(seat);
			makeFooter();
		}
		return buffer.toString();
	}
	
	public void makeHeader(Seat seat) {
		buffer.append(Report.LINE);
		buffer.append("\t\t" + seat.getSeatName());
		buffer.append(Report.TITLE);
		buffer.append(Report.HEADER);
		buffer.append(Report.LINE);
	}
	
	public void makeBody(Seat seat) {
		ArrayList<Passenger> passengerList = seat.getPassengerList();
		
		for(Passenger passenger : passengerList) {
			buffer.append(passenger.getPassengerName());
			buffer.append(" | " );
			buffer.append(passenger.getPassengerId());
			buffer.append(" | " );
			buffer.append(passenger.getSeatType().getSeatName());
			buffer.append(" | " );
			
			getSeat(passenger,seat.getSeatId());
			buffer.append("\n");
			buffer.append(Report.LINE);
		}
		
		
	}

	private void getSeat(Passenger passenger, int seatId) {
		ArrayList<SeatNumber> seatnumberList = passenger.getSeatnumberList();
		int firstId = passenger.getSeatType().getSeatId();
		
		SeatType[] seatType = {new EconomySeat(), new FirstSeat()};
		
		for(SeatNumber seatnumber : seatnumberList) {
			String ST;
			String price;
			
			if(seatnumber.getSeat().getSeatId() == firstId) {
				ST = seatType[Define.F_TYPE].getSeat(seatnumber.getSeatnumber());
				price = seatType[Define.F_TYPE].getPrice(seatnumber.getSeatnumber());
			}else {
				ST = seatType[Define.E_TYPE].getSeat(seatnumber.getSeatnumber());
				price = seatType[Define.E_TYPE].getPrice(seatnumber.getSeatnumber());
			}
			buffer.append(seatnumber.getSeatnumber());
			buffer.append("번좌석");
			buffer.append(" | ");
			buffer.append(ST);
			buffer.append(" | ");
			buffer.append(price);
			buffer.append(" | ");
		}
	}
	
	public void makeFooter() {
		buffer.append("\n"); //줄바꿈
	}
}
