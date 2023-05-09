package ch03.sec05;

public class InfinityAndNanCheckExample {

	public static void main(String[] args) {
		//무한대 숫자(infinity)
		//NaN(not a number)
				
		int x = 5;
		double y = 0.0;
		double z = x / y;
		String a = "abc";
		
		System.out.println(z);
		
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}
		
		if (Double.isNaN(Double.parseDouble(a))) {
			System.out.println("숫자가 아님");
						
		}
	}

}
