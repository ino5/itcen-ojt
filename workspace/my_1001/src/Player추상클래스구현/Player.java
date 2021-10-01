package Player추상클래스구현;

public class Player {
	PlayerLevel playerLevel;
	
	Player(PlayerLevel playerLevel) {
		this.playerLevel = playerLevel;
	}
	
	public void showInfo() {
		playerLevel.showMessageLevel();
	}
	
	public void play(int count) {
		playerLevel.go(count);
	}
}
