package this실습;

class Person {
	// 멤버변수
	private int juminNum; // 주민번호
	private int militaryNum; // 군번
	private int birthYear; // 출생년도
	private int birthMonth; // 출생월
	private int birthDay; // 출생일

	// 생성자
	public Person(int juminNum, int militaryNum,int bYear, int bMonth, int bDay) {
		this.juminNum = juminNum;
		this.militaryNum = militaryNum;
		birthYear = bYear;
		birthMonth = bMonth;
		birthDay = bDay;
	}
	
	public Person(int juminNum, int bYear, int bMonth, int bDay) {
		// [주의] this()는 생성자의 첫 라인에 와야 한다.
		this(juminNum, 0, bYear, bMonth, bDay);
		
		/*
		this.juminNum = juminNum;
		this.militaryNum = 0;
		birthYear = bYear;
		birthMonth = bMonth;
		birthDay = bDay;
		*/
	}
	
	public void showInfo() {
		System.out.println("주민번호: " + juminNum);
		System.out.println("생년월일: " + birthYear + "/" + birthMonth + "/" + birthDay);
		
		if (militaryNum != 0) {
			System.out.println("군번: " + militaryNum + '\n');
		} else {
			System.out.println("군과 관계 없음\n");
		}
	}
}

public class ThisEx {
	public static void main(String[] args) {
		Person man = new Person(961214, 880102, 1996, 12, 14);
		Person woman = new Person(991116, 1990, 11, 16);
		
		man.showInfo();
		woman.showInfo();
	}
}
