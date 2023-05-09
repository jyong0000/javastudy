package quiz;

public class quiz05_9 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0, total= 0;
		for(int i=0; i<array.length; i++) {
			total += array[i].length;
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
			}
		}
		System.out.println("전체 합은 : " + sum + " 입니다.");
		System.out.println("평균은 : " + (double)sum / total + " 입니다.");
	}

}
