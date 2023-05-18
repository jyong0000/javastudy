package airplane;

import java.util.ArrayList;

public class Airplane {
	private static Airplane instance = null;
	private static String AIRPLANE_NAME = "AIR";
	private ArrayList<Passenger> passengerList = new ArrayList<>();
	private ArrayList<Seat> seatList = new ArrayList<>();
	
	public Airplane() {}
	
	public static Airplane getInstance() {
		if(instance == null) {
			instance = new Airplane();
		}
		return instance;
	}
	
	public void addPassenger(Passenger passenger) {
		passengerList.add(passenger);
	}
	
	public void addSeat(Seat seat) {
		seatList.add(seat);
	}
	
	public ArrayList<Passenger> getPassengerList(){
		return passengerList;
	}
	
	public ArrayList<Seat> getSeatList(){
		return seatList;
	}

}