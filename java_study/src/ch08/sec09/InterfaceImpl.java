package ch08.sec09;

public class InterfaceImpl implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("InterfaceImp1-methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceImp1-methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("InterfaceImp1-methodC() 실행");
		
	}

}
