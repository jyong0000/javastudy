package airplane;

import java.util.ArrayList;

import utils.Define;

public class Seat {
	private String seatName; //좌석명
	private int seatId;	//좌석코드
	private int seatType;
	private ArrayList<Passenger> passengerList = new ArrayList<>();
	
	public Seat(String seatName, int seatId) {
		this.seatName = seatName;
		this.seatId = seatId;
		this.seatType = Define.E_TYPE;
	}
	
	public void register(Passenger passenger) {
		passengerList.add(passenger);
	}

	public String getSeatName() {
		return seatName;
	}

	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public int getSeatType() {
		return seatType;
	}

	public void setSeatType(int seatType) {
		this.seatType = seatType;
	}

	public ArrayList<Passenger> getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(ArrayList<Passenger> passengerList) {
		this.passengerList = passengerList;
	}
	
}
