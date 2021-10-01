package 게임플레이어구현;

public class MainBoard {
	public static void main(String[] args) {
		Player player = new Player(); // 처음 생성되면 BeginnerLevel
		player.play(1);
		System.out.println();
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		System.out.println();
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}
}
