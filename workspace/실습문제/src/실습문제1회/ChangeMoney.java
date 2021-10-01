package 실습문제1회;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		int[] arrMoney = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		String[] str = {"오만원권", "만원권", "오천원권", "천원권", "오백원", "백원", "오십원", "십원", "일원"};
		int[] result = new int[9];
		
		System.out.println("금액을 입력하세요 >>> ");
		Scanner in = new Scanner(System.in);
		int Money = in.nextInt(); // 입력받은 문자열을 정수로 변환하여 입력
		
		// 처리와 출력을 한번에 처리하자!
		for (int i = 0; i < arrMoney.length; i++) {
			int num = Money / arrMoney[i]; // 몫
			int remainder = Money % arrMoney[i]; // 나머지
			Money = remainder;
			
			if (num > 0 && i < 4) {
				System.out.println(str[i] + " " + num + "매");
			} else if (num > 0 && i >= 4) {
				System.out.println(str[i] + " " + num + "개");
			}
		}
	}
}
