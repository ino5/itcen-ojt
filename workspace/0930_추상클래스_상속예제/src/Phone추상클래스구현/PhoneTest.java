package Phone추상클래스구현;

public class PhoneTest {
	public static void main(String[] args) {
		System.out.println("<< SmartPhone 테스트 >>");
		Phone phone = new SmartPhone("abc");
		phone.run();
		System.out.println();
		
		System.out.println("<< TelePhone 테스트 >>");
		Phone phone2 = new TelePhone("def");
		phone2.run();
	}
}
