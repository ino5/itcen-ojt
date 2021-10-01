package 실습문제1회;

import java.io.IOException;
import java.util.Scanner;

public class CaseChanger {
	public static void main(String[] args) throws IOException {
		char alpha;
		
		System.out.print("한 문자를 입력하세요  >>> ");
//		Scanner in = new Scanner(System.in);
//		alpha = in.next().charAt(0);
		
		alpha = (char)System.in.read();
		
		if(alpha >= 'a' && alpha <= 'z') {
			// ASCII 코드값 : 'a' : 97, 'A' : 65
			alpha = (char)(alpha - 32);
		} else if (alpha >= 'a' && alpha <= 'Z') {
			alpha = (char)(alpha + 32);
		} else {
			System.out.println("영문자가 아닙니다.");
			System.exit(0);
		}
		System.out.println(alpha);
		System.exit(0);
	}
}
