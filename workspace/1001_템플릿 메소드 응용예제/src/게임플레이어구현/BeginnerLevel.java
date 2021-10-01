package 게임플레이어구현;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달린다.");
	}

	@Override
	public void jump() {
		System.out.println("Jump 할 줄 모른다.");
	}

	@Override
	public void turn() {
		System.out.println("Turn 할 줄 모른다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("<<< 초보자 레벨입니다. >>>");		
	}

}
