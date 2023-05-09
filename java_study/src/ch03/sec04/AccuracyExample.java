package ch03.sec04;

public class AccuracyExample {

	public static void main(String[] args) {
		// 정확한 계산은 정수 연산으로 해야한다.
		
		int apple = 1; // 사과 1조각
		double pieceUnit = 0.1; //10분의 1
		int totalPieces = apple*10;
		int number = 7;
		
		double result1 = apple - number * pieceUnit; // 1 - 0.7 = 0.3
		System.out.println("사과 1개에서 남은 양 : " + result1); 
		
		
		int result2 = totalPieces - number;
		System.out.println("사과 1개에서 남은 양 : " + result2/10.0); 
	}

}
