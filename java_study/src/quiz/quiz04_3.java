package quiz;

public class quiz04_3 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		for (i=0; i<=20; i++) {
			if(i % 2 != 0 && i % 3 != 0 && i % 6 != 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
