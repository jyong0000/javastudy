package ch11.sec03.example01;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String[] array = {"100", "1ㅇㅇ",null, "200"};
		
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]); //문자열 -> int 타입
				System.out.println("array[" + i + "]:" + value);
				
			} catch(Exception e) {
				e.printStackTrace();
			} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
				System.out.println("데이터에 문제가 있음");
			} 
		}
	}
}
