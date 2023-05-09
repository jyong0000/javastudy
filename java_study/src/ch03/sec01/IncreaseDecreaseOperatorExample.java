package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++;	// 11
		++x;	// 12
		System.out.println("x= " + x);
		System.out.println("-------------------------------");
		
		y--;
		--y;
		System.out.println("y= " + y);
		System.out.println("-------------------------------");
		
		z = x++;
		System.out.println("z= " + z); //12
		System.out.println("x= " + x); //13
		System.out.println("-------------------------------");
		
		z = ++x;
		System.out.println("z= " + z); //14
		System.out.println("x= " + x); //14
		System.out.println("-------------------------------");
		
		z = ++x + y++; // z = 15 + 8;
		System.out.println("z= " + z); 
		System.out.println("x= " + x);
		System.out.println("y= " + y); 
				
	}

}
