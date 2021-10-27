
public class URLPathTest {

	public static void main(String[] args) {
		
		String url="http://localhost:8080/Model2_Board/login.do";
		
		int lastpoint = url.lastIndexOf("/");
		
//		System.out.println(lastpoint); //34출력
		
		//개발자는 "/login.do" 문자열만 얻어내고 싶다.
		String FilePath = url.substring(lastpoint);
		System.out.println(FilePath); //login.do 출력
		
	}

}
