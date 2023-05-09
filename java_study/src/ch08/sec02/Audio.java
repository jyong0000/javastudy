package ch08.sec02;

public class Audio implements RemoteControl{
	//필드
	private int volume;
	private int memoryVolume;
	
	@Override
	public void turnon() {
		System.out.println("오디오를 켭니다.");
		
	}

	@Override
	public void turnoff() {
		System.out.println("오디오를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		//볼륨의 크기를 0~10 사이를 유지시킴
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재 Audio 볼륨: " + volume);
	}

	//디폴트
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = volume; // 원래 볼륨크기 저장
			System.out.println("무음처리합니다");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("무음해제합니다.");
			setVolume(this.memoryVolume);
		}
	}
	

}
