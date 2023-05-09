package quiz;

public class Q6_20 {
	boolean isNumber;
	String str;
	
	static boolean isNumber(String str) {
		if(str == null && str == " ") {
			System.out.println(false);
		}else if (str.matches("[+-]?\\d*(\\.\\d+)?")) {
			return true;
		}		
		return false;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}

}
