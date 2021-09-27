package 주민번호로부터정보추출;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JuminCheckEx {
	public static void main(String[] args) {
		//준비 단계: 필요 변수, 배열의 초기화
		String juminNum;
		int sum = 0; //누계 변수는 0으로 초기화
		int[] weight = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5}; // 가중치 배열 초기화 
		int temp, result;
		
		//입력 단계
		System.out.print("주민번호 입력 >>> ");
		Scanner scan = new Scanner(System.in);
		juminNum = scan.nextLine(); // 문자열로 입력 받음 => '-; 포함하여 입력요!!
		/*
		 * 입력 받은 주민번호를 유효성 검사 => 정규 표현식(regex) 패턴 적용
		 */
		String regex = "^[0-9]{6}-[1234][0-9]{6}$";
		
		//[첫번째 방법]
		//boolean check = Pattern.matches(regex, juminNum);
		
		//[두번째 방법]
		boolean check = juminNum.matches(regex);
		
		if (check == false) {
			System.out.println("입력된 주민번호는 정규 표현식에 형식에 맞지 않음!");
			return;
		}
		System.out.println("입력된 주민번호는 정규 표현식에 형식에 적합함!");
		
		/*
		 * 입력받은 주민번호에 체크 공식 적용
		 */
		//1단계 적용 => sum 구하기
		for (int i = 0; i < juminNum.length() - 1; i++) {
			sum += weight[i] * (juminNum.charAt(i) - '0');
		}
		
		temp = 11 - (sum % 11);
		result = temp % 10;
		if (juminNum.charAt(juminNum.length() - 1) - '0' == result) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
