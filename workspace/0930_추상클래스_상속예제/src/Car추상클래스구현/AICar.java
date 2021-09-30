package Car추상클래스구현;

public class AICar extends Car {

	@Override  // '재정의'하라!!
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 스스로 방향을 전환합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춘다.");
		
	}

	@Override
	public void wipe() {
		System.out.println("비나 눈의 양에 따라 와이퍼 빠르기가 자동으로 조절됩니다.");
	}

}
