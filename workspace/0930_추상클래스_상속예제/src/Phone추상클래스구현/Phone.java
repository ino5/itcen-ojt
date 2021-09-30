package Phone추상클래스구현;

public abstract class Phone {
	public String ownerName;
	
	
	Phone() {
		
	}
	
	Phone(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
	public abstract void doAction();
	
	public void turnOn() {
		System.out.println("폰을 켠다.");
	}
	
	public void turnOff() {
		System.out.println("폰을 끈다.");
	}
	
	final public void run() {
		turnOn();
		doAction();
		turnOff();
	}
}
