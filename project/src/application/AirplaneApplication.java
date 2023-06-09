package application;

import airplane.*;
import report.Report;
import utils.Define;

public class AirplaneApplication {
	Airplane AIR = Airplane.getInstance();
	Seat first, economy;
	Report report = new Report();
	
	public static void main(String[] args) {
		AirplaneApplication ap = new AirplaneApplication();
		ap.createSeat();
		ap.createPassenger();
		
		String report = ap.report.getReport();
		System.out.println(report);
	}
	
	public void createSeat() {
		first = new Seat("First", Define.FIRST, Define.F_TYPE);
		economy = new Seat("Economy", Define.ECONOMY, Define.E_TYPE);
		
		AIR.addSeat(first);
		AIR.addSeat(economy);
	}

	
	public void createPassenger() {
		Passenger passenger1 = new Passenger("홍길동", 1111, economy);
		Passenger passenger2 = new Passenger("허재용", 2222, first);
		Passenger passenger3 = new Passenger("박지은", 3333, economy);
		Passenger passenger4 = new Passenger("차슬기", 4444, first);
		Passenger passenger5 = new Passenger("이현욱", 5555, economy);
		Passenger passenger6 = new Passenger("임지연", 6666, first);
		
		AIR.addPassenger(passenger1);
		AIR.addPassenger(passenger2);
		AIR.addPassenger(passenger3);
		AIR.addPassenger(passenger4);
		AIR.addPassenger(passenger5);
		AIR.addPassenger(passenger6);
		
		economy.register(passenger1);
		first.register(passenger2);
		economy.register(passenger3);
		first.register(passenger4);
		economy.register(passenger5);
		first.register(passenger6);
		
		addSeatForPassenger(passenger1, economy, 1);
		addSeatForPassenger(passenger2, first, 1);
		addSeatForPassenger(passenger3, economy, 4);
		addSeatForPassenger(passenger4, first, 5);
		addSeatForPassenger(passenger5, economy,15);
		addSeatForPassenger(passenger6, first, 3);
		

	}
	
	public void addSeatForPassenger(Passenger passenger, Seat seat, int num) {
		SeatNumber sn = new SeatNumber(passenger.getPassengerId(),seat, num);
		passenger.addSeatNumber(sn);
	}
}
