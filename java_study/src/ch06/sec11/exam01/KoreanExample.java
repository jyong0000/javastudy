package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		Korean K1 = new Korean("123456-1234567","감자바");
		
		//필드값 읽기
		System.out.println(K1.nation);
		System.out.println(K1.ssn);
		System.out.println(K1.name);
		
		//필드값 변경
		//K1.nation = "USA"; //변경X (final 필드)
		//K1.ssn = "123213"; //변경X (final 필드)
		K1.name = "이자바"; // O
		
	}

}
