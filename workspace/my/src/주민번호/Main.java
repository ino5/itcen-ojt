package ÁÖ¹Î¹øÈ£;

public class Main {
	public static void main(String[] args) {
		String str = "9302251234569";
		int sum = 0;
		int[] weight = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		for (int i = 0; i < str.length() - 1; i++) {
			sum += weight[i] * (str.charAt(i) - '0');
		}
		int temp = 11 - (sum % 11);
		int result = temp % 10;
		System.out.println(result);
		System.out.println(Utils.check(""));
	}
}
