package Player추상클래스구현;

public class Intermediate extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프할 수 있습니다.");
	}

	@Override
	public void turn() {
		System.out.println("턴할 수 없습니다.");

	}

	@Override
	public void showMessageLevel() {
		System.out.println("중급자 레벨: 빠르게 달리고 높이 점프할 수 있다. 턴할 줄 모른다.");
	}

}
