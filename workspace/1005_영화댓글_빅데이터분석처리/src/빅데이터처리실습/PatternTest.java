package 빅데이터처리실습;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
	public static void main(String[] args) {
		String str = "빅데이터의 다음 단계는 예측분석이다. 이제 예측분석의 키워드를 이해하는 기업만 살아남는다.";
		
		Pattern p = Pattern.compile("예측분석");
		Matcher m = p.matcher(str);
		
		int count = 0;
		String word = null;
		
		while (m.find()) { // find()는 패턴이 일치하면 true, 일치하지 않으면 false
			word = m.group(); // group()는 대상 텍스트 전체에서 패턴과 일치된 텍스트를 반환
			count++;
//			System.out.println(m.start());
//			System.out.println(m.end());
		}
		System.out.println("분석결과: " + "패턴일치");
		System.out.println(word + " 단어=> " + count + "개");
		
	}
}
