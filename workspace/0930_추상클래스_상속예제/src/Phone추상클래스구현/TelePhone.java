package Phone추상클래스구현;

public class TelePhone extends Phone{

	TelePhone(String name) {
		super(name);
	}	
	
	@Override
	public void doAction() {
		System.out.println("자동 응답을 한다.");
	}
}
