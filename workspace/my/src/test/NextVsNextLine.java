package test;

import java.util.Scanner;

public class NextVsNextLine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String a2 = scanner.next();
		String a3 = scanner.next();
		String b = scanner.nextLine();
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.length());
		System.out.println(b.length());
		
		scanner.close();
	}
}
