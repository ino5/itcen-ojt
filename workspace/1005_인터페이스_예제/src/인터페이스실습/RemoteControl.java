package 인터페이스실습;

/**
 * 
 * RemoteControl 인터페이스는 Television 클래스와 Audio 클래스가
 * 가지고 있는 기능들을 '추상 메소드'로 정의해두는 인터페이스이다.
 *
 */



public interface RemoteControl {
	// '볼륨' 조절을 상수로 선언
	// public static final 생략 가능!!
	public static final int MAX_VOLUMN = 10; // 최대 볼륨
	public static final int MIN_VOLUMN = 0; // 최소 볼륨
	
	// '추상 메소드' 선언
	// public abstract 생략 가능
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolumn(int volumn);
	
	/*
	 * 자바 8버전 부터는 '디폴트' 메소드와 '정적' 메소드를 구성 멤버로 구현 가능!!
	 * 자바 개발자 입장에서 유연성이 부여!! 
	 */
	
	// '디폴트' 메소드 구현 => 허용한 이유 => 기존 interface를 확장해서 새로운 기능을 추가하기
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//'정적' 메소드 구현 => 허용한 이유 => 디폴트 메소드와는 달리 객체가 없어도 인터페이스만으로 호출이 가능함!
	static void changeBettery() {
		System.out.println("건전지를 교환합니다.");
	}
	
}
