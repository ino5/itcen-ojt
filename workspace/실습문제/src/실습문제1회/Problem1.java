package 실습문제1회;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 한 자를 입력하세요: ");
		char ch = sc.next().charAt(0);
		int diff = 'a' -'A';
		if ('a' <= ch && ch <= 'z') {
			ch -= diff;
			System.out.println(ch);
		} else if ('A' <= ch && ch <= 'Z') {
			ch += diff;
			System.out.println(ch);
		} else {
			System.out.println("영문자가 아닙니다.");
		}
		sc.close();
	}
}
