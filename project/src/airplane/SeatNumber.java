package airplane;

public class SeatNumber {
	private int passengerId;
	private Seat seat;
	private int seatnumber;
	
	public SeatNumber(int passengerId, Seat seat, int seatnumber) {
		this.passengerId = passengerId;
		this.seat = seat;
		this.seatnumber = seatnumber;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public int getSeatnumber() {
		return seatnumber;
	}

	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}
	
	
	
	
}
