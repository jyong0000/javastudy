package program;

public class Game {
	int attack, Hp, leftHp;
	
	Game(int attack, int Hp){
		this.attack = attack;
		this.Hp = Hp;
		System.out.println("공격력: " + attack);
		System.out.println("체력: " + Hp);
	}
	
	
	void run(int count) {
		while(true) {
			count++;
			this.leftHp = leftHp; 
			leftHp = Hp - attack;
			System.out.println("남은체력: " + leftHp);
		}
	}

}
