package Player추상클래스구현;

public class PlayerTest {
	public static void main(String[] args) {
		PlayerLevel beginner = new Beginner();
		Player player1 = new Player(beginner);
		player1.playerLevel.showMessageLevel();
	}
}
