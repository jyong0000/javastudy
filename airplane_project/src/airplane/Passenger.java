package airplane;

import java.util.ArrayList;


public class Passenger {
	private String passengerName;
	private int passengerId;
	private Seat seatType;
	private ArrayList<SeatNumber> seatnumberList = new ArrayList<>();
	
	public Passenger(String passengerName, int passengerId,Seat seatType ) {
		this.passengerName = passengerName;
		this.passengerId = passengerId;
		this.seatType = seatType;
	}
	
	public void addSeatNumber(SeatNumber seatnumber) {
		seatnumberList.add(seatnumber);
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}


	public ArrayList<SeatNumber> getSeatnumberList() {
		return seatnumberList;
	}

	public void setSeatnumberList(ArrayList<SeatNumber> seatnumberList) {
		this.seatnumberList = seatnumberList;
	}

	public Seat getSeatType() {
		return seatType;
	}

	public void setSeatType(Seat seatType) {
		this.seatType = seatType;
	}
	
	
	
}