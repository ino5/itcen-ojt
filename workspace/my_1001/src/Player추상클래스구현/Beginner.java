package Player추상클래스구현;

public class Beginner extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프할 수 없습니다.");
	}

	@Override
	public void turn() {
		System.out.println("턴할 수 없습니다.");
	}

	@Override
	public void showMessageLevel() {
		System.out.println("초보자 레벨: 천천히 달릴 수 있다. 점프할 줄 모른다. 턴할 줄 모른다.");
	}

}
