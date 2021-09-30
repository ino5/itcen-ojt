package Phone추상클래스구현;

public class SmartPhone extends Phone {
	
	SmartPhone(String name) {
		super(name);
	}
	
	@Override
	public void doAction() {
		System.out.println("인터넷을 검색한다.");
	}

}
