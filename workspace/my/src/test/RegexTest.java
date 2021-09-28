package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String[] args) {
		int cnt = 0;
		
		String str = "erin0521@partner.sk.com¤¡";
		System.out.println("length: " + str.length());
		String regex = "^\\w+@\\w+\\.\\w+(\\.\\w+)?";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()) {
			cnt++;
			System.out.println(matcher.group());
			System.out.println(matcher.start());
			System.out.println(matcher.end());
		}
		System.out.println("cnt: " + cnt);
	}
}
