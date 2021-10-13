package 가상의로봇릴레이게임;

class RobotRace extends Thread {
	// 생성자
	public RobotRace(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i ++ ) {
			System.out.println(getName() + "가" + i*10 + "m전진");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.toString());
			}
		}

	}
}

public class RobotRaceStart {
	public static void main(String[] args) {
		RobotRace robotA= new RobotRace("로봇-A");
		RobotRace robotB= new RobotRace("로봇-B");
		RobotRace robotC= new RobotRace("로봇-C");
		
		robotA.start();
		robotB.start();
		robotC.start();
	}
}
