package 실습문제1회;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		String[] names = {"오만원권", "만원권", "오천원권", "천원권", "오백원", "백원", "오십원", "십원"};
		int[] prices = {50000, 10000, 5000, 1000, 500, 100, 50, 10};		

		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력해 주세요: ");
		int money = sc.nextInt();
		int[] cnts = new int[names.length];

		for (int i = 0; i < cnts.length; i++) {
			while (money >= prices[i]) {
				money -= prices[i];
				cnts[i]++;
			}
		}
		
		for (int i = 0; i < cnts.length; i++) {
			if (cnts[i] > 0) {
				if (prices[i] >= 1000) {
					System.out.println(names[i] + " " + cnts[i] + "매");
				} else {
					System.out.println(names[i] + " " + cnts[i] + "개");
				}
			}
		}
		
		sc.close();
	}
}
