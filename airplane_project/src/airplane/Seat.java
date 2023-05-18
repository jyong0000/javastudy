package airplane;

import java.util.ArrayList;

public class Seat {
	private String seatName; 
	private int seatId;	
	private int seatType;
	private ArrayList<Passenger> passengerList = new ArrayList<>();
	
	public Seat(String seatName, int seatId, int seatType) {
		this.seatName = seatName;
		this.seatId = seatId;
		this.seatType = seatType;
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