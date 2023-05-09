package quiz;

public class MemberService {
	String id, password;
	boolean login,logout;
	
	boolean login(String id, String password) {
		this.id = id;
		this.password = password;
		return true;
	}
	boolean logout(String id) {
		this.id = id;
		return false;
	}
	
	public static void main(String[] args) {
		
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
			System.out.println(memberService.id + "님이 로그아웃 되셨습니다.");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}
