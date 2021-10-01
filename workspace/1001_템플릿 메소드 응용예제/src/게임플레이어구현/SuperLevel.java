package 게임플레이어구현;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("아주 빨리 달린다.");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 jump 한다.");
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴 돈다.");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("<<< 고급자 레벨입니다. >>>");	
	}

}
