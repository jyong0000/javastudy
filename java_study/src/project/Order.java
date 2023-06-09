package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        ArrayList<Menu> orderList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        int price;
        int total = 0;
        
        while (true) {
        	System.out.println("=================");
        	System.out.println("메뉴");
            System.out.println("1. 피자");
            System.out.println("2. 파스타");
            System.out.println("3. 샐러드");
            System.out.println("4. 주문 종료");
        	System.out.println("=================");
            System.out.print("메뉴를 선택하세요: ");
            
            int menuNum = scanner.nextInt();
            scanner.nextLine();
            if (menuNum == 4) {
                break;
            }
           System.out.print("이름을 입력하세요: ");
            name = scanner.nextLine();
            System.out.print("가격을 입력하세요: ");
            price = scanner.nextInt();
            scanner.nextLine();
            switch (menuNum) {
			case 1:
				System.out.print("사이즈를 입력하세요: ");
				String size = scanner.nextLine();
				Pizza pizza = new Pizza(name, price, size);
                orderList.add(pizza);
				break;

			case 2:
				System.out.print("소스를 선택하세요: ");
				String sauce = scanner.nextLine();
				Pasta pasta = new Pasta(name, price, sauce);
				 orderList.add(pasta);
				break;
			
			case 3:
				System.out.print("드레싱을 선택하세요: ");
				String dressing = scanner.nextLine();
				Salad salad = new Salad(name, price, dressing);
				 orderList.add(salad);
				break;
			default:
			System.out.println("잘못된 입력입니다,");
			break;
			
			}
        }
        System.out.println("주문 내역:");
        for (Menu item : orderList) {
            item.printInfo();
            total += item.getPrice();
        }
        System.out.println("총 결제 금액: " + total + "원");
                    
    	System.out.println("=================");
        System.out.println("1. 현금 결제");
        System.out.println("2. 카드 결제");
        System.out.print("결제 수단을 선택하세요: ");
        int payment = scanner.nextInt();
        scanner.nextLine();
        
        switch (payment) {
		case 1:
			System.out.println("현금결제를 진행합니다.");
			break;

		case 2:
			System.out.println("카드결제를 진행합니다.");
			break;
			
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
    	System.out.println("=================");
        System.out.println("감사합니다. 다음에 또 오세요.");
    }
}