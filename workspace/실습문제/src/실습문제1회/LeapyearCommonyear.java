package 실습문제1회;

import java.util.Scanner;

public class LeapyearCommonyear {
	public static void main(String[] args) {
		int year;
		
		Scanner in = new Scanner(System.in);
		System.out.print("년도를 입력하세요 >>> ");
		year = in.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
		
	}
}
