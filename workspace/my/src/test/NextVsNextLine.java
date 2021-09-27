package test;

import java.util.Scanner;

public class NextVsNextLine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.nextLine();
		System.out.println(a);
		System.out.println(b);
		
	}
}
