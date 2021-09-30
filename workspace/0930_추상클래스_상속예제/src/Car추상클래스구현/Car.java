package Car추상클래스구현;

public abstract class Car { // 추상 클래스
	// 추상 메소드
	public abstract void drive(); // '달리는' 기능이 서로 다르기 때문에
	public abstract void stop(); // '정지' 기능이 서로 다르기 때문에
	public abstract void wipe();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 템플릿 메소드는 final 예약어를 사용해 선언한다. '틀'이 있는 메소드 의미!!
	/*
	 * 메소드 '실행 순서'나 '시나리오'를 정의한 것이다.
	 */
	final public void run() {
		startCar();
		drive();
		wipe();
		stop();
		turnOff();
	}
}
