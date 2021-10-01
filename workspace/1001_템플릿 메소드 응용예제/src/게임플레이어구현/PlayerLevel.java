package 게임플레이어구현;

public abstract class PlayerLevel {
	// 추상 메소드
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	// 템플릿 메소드 구현 => 게임 플레이어 '시나리오' => 실체 클래스에서 재정의 할 수 없다.
	final public void go(int count) {
		run();
		
		for (int i = 0; i < count; i++) {
			jump();
		}
		
		turn();
	}
}
