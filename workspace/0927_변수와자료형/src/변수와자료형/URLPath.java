package 변수와자료형;

/*
 * 중요 예제
 */
public class URLPath {
	public static void main(String[] args) {
		String url = "http://localhost:8080/Model2_Board/login.do";
		int lastPosition = url.lastIndexOf("/");
		// System.out.println(lastPosition); // 34가 출력됨.
		
		String filePath = url.substring(lastPosition);
		System.out.println(filePath); // "/login.do" 문자열을 얻어옴.

	}

}
