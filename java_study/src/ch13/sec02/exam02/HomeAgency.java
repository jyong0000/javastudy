package ch13.sec02.exam02;

public class HomeAgency implements Rentalable<Home> {//Home 클래스를 타입으로 사용

	@Override
	public Home rent() {
		return new Home();
	} 

}
