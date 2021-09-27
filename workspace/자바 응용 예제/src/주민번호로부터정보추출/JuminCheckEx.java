package 주민번호로부터정보추출;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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
		
		//2단계 공식 => temp 값이 두 자리인 주민번호가 있다. 10 or 11
		temp = 11 - (sum % 11);
		
		//3단계 공식 => temp 값이 두 자리인 주민번호를 대비해서...
		result = temp % 10;
		
		//주민번호 정상 유무 체크
		if (juminNum.charAt(juminNum.length() - 1) - '0' == result) {
			System.out.println("입력된 주민번호가 정상입니다.");
			
			//"나이" 추출
			/*
			"나이" 추출 시나리오 작성
			1. 현재 시스템으로부터 년도 얻어내기 => 2021
			2. 주민번호 앞 자리의 생년월일에서 년도 두 자리만 얻어오기 => "97" => 97 정수값으로 변환
			3. 주민번호 뒤 자리의 첫번째 자리 1, 2, 3, 4 중 어느 것인지 비교 판단하여
			   if 1, 2면은 1900을 더해주고 => 1900 + 97 = 1997
			      3, 4면은 2000을 더해준다.
			4. 2021 - 1997 = 나이 추출
			*/
			Calendar calendar = Calendar.getInstance(Locale.KOREA);
			int currentYear = calendar.get(Calendar.YEAR);
			int juminYear = Integer.parseInt(juminNum.substring(0, 2));
			if (juminNum.charAt(7) - '0' < 3) {
				juminYear += 1900;
			} else {
				juminYear += 2000;
			}
			int age = currentYear - juminYear + 1;
			System.out.println("나이: " + age);
			
			// "성별" 추출
			if((juminNum.charAt(7) - '0') % 2 == 0) {
				System.out.println("성별: 여자");
			} else {
				System.out.println("성별: 남자");
			}
			
			// "지역" 추출
			List<Integer> list = new LinkedList<Integer>();
			
			
			String place = map.get(Integer.parseInt(juminNum.substring(8, 10)));
			System.out.println(place);
			
			
		} else {
			System.out.println("입력된 주민번호가 틀린 번호입니다.");
		}
	}
}
