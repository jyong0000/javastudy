package quiz;

public class Q6_21 {
	static int max;
	
	public void max() {
		this.max = max;
	}
	static int max(int[] data) {
		for(int i=0; i<data.length; i++) {
			if(max < data[i]) {
				max = data[i];
			} 
			else if(data.length == 0) {
				max = -999999;
			}
				}
		
		return max;
		
	}
	
	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
//		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열


	}
}

