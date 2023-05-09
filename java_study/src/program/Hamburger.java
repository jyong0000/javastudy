package program;

public class Hamburger {
	int bread = 10 , patty = 5, tomato = 5; //빵 10개  패티 5개 토마토 5개
	double source;	// 소스의 양 1.0~2.0
	String potato, drink; // 감자튀김과 음료 
	
	Hamburger(String potato,String drink) { // 감자튀김의 사이즈와 음료 정하기
		this.potato = potato;
		this.drink = drink;
	}


	void addSource(double source) {	//소스의 양 추가하기
		this.source = source;

	}
		
	//햄버거 만들기
	void run(int count) {	
		while(true) {	//재료가 모두 사라질떄까지 반복
		System.out.println("==================================");
		System.out.println("감자튀김의 사이즈는 " + potato + "입니다.");
		System.out.println("음료는 " + drink + "입니다.");
		System.out.println("소스의 양은 " + source + "배 입니다.");
		System.out.println("햄버거가 " + count + "개 나왔습니다.");
		System.out.println("==================================");
		bread = bread -= (2 * count);
		if (0 < bread) { 
			System.out.println("빵이 " + bread + "개 남았습니다.");
		}else { 
			System.out.println("매진입니다.");
			return;
		}
		
		patty = patty -= (1 * count);
		if (0 < patty) {
			System.out.println("패티가 " + patty + "개 남았습니다.");
		}else {
			System.out.println("매진입니다.");
			return;
		}
		
		tomato = tomato -= (1 * count);
		if (0 < tomato) {
			System.out.println("토마토가 " + tomato + "개 남았습니다.");
		}else {
			System.out.println("매진입니다.");
			return;
		}
		}
	}	
}
