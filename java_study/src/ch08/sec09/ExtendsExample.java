package ch08.sec09;

public class ExtendsExample {

	//InterfaceC 가 InterfaceA,InterfaceB를 상속하고 있으므로 아래와 같이 사용가능
	public static void main(String[] args) {
		InterfaceA ia = new InterfaceImpl();
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = new InterfaceImpl();
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = new InterfaceImpl();
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
