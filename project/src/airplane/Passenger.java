package airplane;

import java.util.ArrayList;

import grade.SeatType;

public class Passenger {
	private String passengerName;
	private int passengerId;
	private ArrayList<SeatNumber> seatnumberList = new ArrayList<>();
	
	public Passenger(String passengerName, int passengerId) {
		this.passengerName = passengerName;
		this.passengerId = passengerId;
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
	
	
	
}
