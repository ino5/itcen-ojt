
public class URLPathTest {
	public static void main(String[] args) {
		String url = "http://localhost:8080/Model2_Board/login.do";
		int lastpoint = url.lastIndexOf("/");
		// System.out.println(lastpoint); // 34
		
		// 개발자는 "/login.do" 문자열만 얻어내고 싶다.
		String filePath = url.substring(lastpoint);
		System.out.println(filePath); // "/login.do" 출력
	}
}
