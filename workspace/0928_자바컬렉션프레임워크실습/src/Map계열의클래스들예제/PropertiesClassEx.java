package Map계열의클래스들예제;

import java.util.Enumeration;
import java.util.Properties;

/*
 * Properties 클래스는 주로 스프링 MVC 기반의 게시판 구현 시 사용
 * 스프링 환경 설정 파일 (applicationContext.xml) 생성할 때 주로 사용
 */

public class PropertiesClassEx {

	public static void main(String[] args) {
		// 객체 생성
		Properties prop = new Properties();
		
		// 객체에 key와 value 저장
		prop.setProperty("name", "박태호");
		prop.setProperty("email", "park345@naver.com");
		prop.setProperty("HP", "010-2315-1234");
		
		// 객체 가져오기
		Enumeration enu = prop.propertyNames();
		
		while (enu.hasMoreElements()) {
			String ele = (String) enu.nextElement();
			System.out.println(ele + ":" + prop.getProperty(ele));
		}

	}

}
