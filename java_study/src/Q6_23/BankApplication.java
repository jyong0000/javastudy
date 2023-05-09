package Q6_23;

import java.util.Scanner;

public class BankApplication {
	//static 필드
	
	//계좌객체를 저장 할수있는 배열(디폴트 값: null)
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택>");
			int selectNo = scanner.nextInt(); 
			
			switch (selectNo) {
			case 1:
				createAccount();
				break;

			case 2:
				accountList();
				break;
				
			case 3:
				deposit();
				break;

			case 4:
				 withdraw();
				break;

			case 5:
				run = false;
				break;
			default:
				System.out.println("1~5사이의 숫자를 입력해주세요!");
				break;				
			}
		}
	}

		//계좌 생성하기
		private static void createAccount() {
			System.out.println("-------");
			System.out.println("계좌생성");
			System.out.println("-------");
			
			System.out.println("계좌번호 : ");
			String ano =  scanner.next(); //String 타입으로 입력을 받는다.
			
			System.out.println("계좌주 : ");
			String owner =  scanner.next(); //String 타입으로 입력을 받는다.

			System.out.println("초기입금액 : ");
			int balance =  scanner.nextInt(); // int 타입으로 입력을 받는다.

			//계좌생성
			Account newAccount = new Account(ano, owner, balance);	
			/*
			 참고 : String이 참조 타입이기 때문에 아래와 같이 사용하는 것 처럼 Account도 참조 타입이다.
			 String[] arr = {"a","b"};
			 
			 for(String a: arr){
			 	System.out.println(a);
			 */
			
			//중요. 배열안에 객체를 넣는다.
			for(int i=0; i<accountArray.length; i++) {
				//accountArray[0]에만 계좌객체가 저장되므로 아래와같이 처리한다.
				if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("계좌가 생성되었습니다.");
				break; //계좌를 생성하면 for문을 나온다.
				}
			}
			
			//계좌가 잘 생성이 되었나 확인(객체이므로 주소가 찍힌다.)
			/*
			for(Account account : accountArray) {
				System.out.println(account);
				}
				*/
		}
		
		//계좌목록 보여주기
		private static void accountList() {
			System.out.println("-------");
			System.out.println("계좌목록");
			System.out.println("-------");
			
			for(Account account : accountArray) {
				//배열이 null이 아닐때만 실행하기위해
				if(account != null) {
					System.out.print("계좌번호 : " + account.getAno());
					System.out.print(" ");
					System.out.print("계좌주 : " + account.getOwner());
					System.out.print(" ");
					System.out.println("금액 : " + account.getBalance());
				}
				}
			}
		
		
		//예금하기
		private static void deposit() {
			System.out.println("-------");
			System.out.println("예금");
			System.out.println("-------");
			
			//계좌번호, 예금액 입력
			System.out.println("계좌번호 : ");
			String ano  = scanner.next(); // String타입으로 입력을 받는다.
			
			System.out.println("예금액 : ");
			int money = scanner.nextInt();
			
			//계좌찾기
			//리턴해 주는 값을 같은 타입인 Account로 받는다.
			//account 변수에는 찾은 계좌객체가 들어있따.
			Account account = findAccount(ano);
			
			if(account == null) {
				System.out.println("결과: 계좌가 없습니다.");
				return;	//메소드를 끝낸다.
			}
			account.setBalance(account.getBalance() + money);
			System.out.println("결과 : 예금완료");
		}
		
		
		//출금하기
		private static void withdraw() {
			System.out.println("-------");
			System.out.println("출금");
			System.out.println("-------");
			//계좌번호, 출금액 입력
			System.out.println("계좌번호 : ");
			String ano  = scanner.next(); // String타입으로 입력을 받는다.
			
			System.out.println("출금액 : ");
			int money = scanner.nextInt();
			
			//계좌찾기
			//리턴해 주는 값을 같은 타입인 Account로 받는다.
			//account 변수에는 찾은 계좌객체가 들어있따.
			Account account = findAccount(ano);
			
			if(account == null) {
				System.out.println("결과: 계좌가 없습니다.");
				return;	//메소드를 끝낸다.
			}
			account.setBalance(account.getBalance() - money);
			System.out.println("결과 : 출금완료");
		}
	
		
		
		//계좌찾기
		private static Account findAccount(String ano) {
			Account resultAccount = null;
			for(Account account : accountArray ) {
				//배열의 값이 null이 아닐때만 실행한다. => account 객체를 가지고 있을때
				if(account != null) {
					if(ano.equals(account.getAno())) {
						//여기서 return을 하면 안되므로 아래와같이 찾은 계좌를  Account타입의 변수인 resultAccount에 넣어준다.
						resultAccount = account;
						break;
					}
				}
			}
			return resultAccount; // 찾은계좌를 리턴해준다.
		}
}
