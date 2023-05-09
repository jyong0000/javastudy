package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnon();
		rc.setVolume(5);
		
		// 디폴트 메세지 호출
		rc.setMute(true);
		rc.setMute(false);
		rc.turnoff();
		
		System.out.println();
		
		RemoteControl ac = new Audio();
		ac.turnon();
		ac.setVolume(5);
		
		ac.setMute(true);
		ac.setMute(false);
		
		ac.turnoff();
		//상수 => 클래스명, 필드명
//		System.out.println(RemoteControl.MAX_VOLUME);
//		System.out.println(RemoteControl.MIN_VOLUME);
		
		//정적메소드 호출 => 클래스명.메소드명
		RemoteControl.changeBattery();
	}

}
