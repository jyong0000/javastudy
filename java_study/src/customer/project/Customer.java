package customer.project;

//silver등급 고객에 대한 class
public class Customer {
	//필드
	private int customerId; //고객ID
	private String customerName; //고객이름
	private String customerGrade; //고객등급
	int bonusPoint; //보너스 포인트 점수
	double bonusRatio; //보너스 비율
	
	//생성자
	public Customer() {
		initCustomer();
	}
	public Customer(int customerID, String customerName) {
		this.customerId = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	//메소드
	//고객 등급 초기화
	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	//보너스 포인트 계산, 가격 리턴
	public int calcPrice(int price) {
		//1. 보너스 포인트 쌓인다.
		bonusPoint += (price * bonusRatio);
		//2. 사용자가 지불할 가격을 리턴.
		return price; //일반(silver)고객은 할인이 없으므로 지불한 값을 리턴해준다.
	}
	
	//고객정보 출력 메소드 
	public String showCustomerInfo() {
		return customerName + "님의 등급 : " + customerGrade + ", 보너스 포인트 : " + bonusPoint + "점";
	}
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}
