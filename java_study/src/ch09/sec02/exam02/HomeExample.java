package ch09.sec02.exam02;

public class HomeExample {
	public static void main(String[] args) {
		Home home = new Home();
		
		home.use1();
		System.out.println();
		home.use2();
		System.out.println();
		home.use3(new RemotControl() {
			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");
			
		);
	}
}
