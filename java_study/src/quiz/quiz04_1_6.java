package quiz;

public class quiz04_1_6 {

	public static void main(String[] args) {
		int year = 400;
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("true");
		}
	}

}
