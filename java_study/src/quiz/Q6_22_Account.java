package quiz;

public class Q6_22_Account {
	
	//상수 필드 
	
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		
		// 0 ~ 100 사이가 아닌 잔고가 매개변수로 들어오면 매소드를 끝낸다.
		if (balance < MIN_BALANCE || MAX_BALANCE < balance) {
			return;
		}
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		 Q6_22_Account account = new  Q6_22_Account();


		 account.setBalance(10000);
		 System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000

		 account.setBalance(-100);
		 System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000

		 account.setBalance(2000000);
		 System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000

		 account.setBalance(300000);	
		 System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 300000

	}

}
