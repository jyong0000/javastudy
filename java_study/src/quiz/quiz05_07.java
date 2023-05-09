package quiz;

public class quiz05_07 {

	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		System.out.println("총합은 : " + sum);
	}

}
