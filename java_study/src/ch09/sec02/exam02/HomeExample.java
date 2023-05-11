package ch09.sec02.exam02;

import ch09.sec02.exam02.Home;
import ch09.sec02.exam02.RemoteControl;

public class HomeExample {
	public static void main(String[] args) {
		//Home 객체 생성
		Home home = new Home();

		//익명 구현 객체가 대입된 필드 사용
		home.use1();
		
		//익명 구현 객체가 대입된 로컬 변수 사용
		home.use2();

		//익명 구현 객체가 대입된 매개변수 사용
		home.use3(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("난방을 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("난방을 끕니다.");
			}
		});
	}
}