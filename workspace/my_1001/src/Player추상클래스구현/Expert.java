package Player추상클래스구현;

public class Expert extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("아주 빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 점프할 수 있습니다.");
	}

	@Override
	public void turn() {
		System.out.println("턴할 수 있습니다.");

	}

	@Override
	public void showMessageLevel() {
		System.out.println("고급자 레벨: 아주 빠르게 달리고 아주 높이 점프하고 턴 할 수 있습니다.");
	}

}
