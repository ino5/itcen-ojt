package 이메일유효성검사패턴;

/*
 * 이메일 데이터에 유효성 검사 패턴 생성
 */

public class EmailRegexEx {
	public static void main(String[] args) {
		String[] email_ex = {"king5901@naver.com",
							 "kim1234@gmail.com",
							 "erin0521@partner.sk.comㄱ",
							 "asd456@partner.sk.com.aaa"};
		// 이메일 패턴
		String email_pattern = "^\\w+@\\w+\\.\\w+(\\.\\w+)?";
		
		for (String email : email_ex) {
			boolean check = email.matches(email_pattern);
			
			if (check == true) {
				System.out.println("적합한 이메일: " + email);
			} else {
				System.out.println("부적합한 이메일: " + email);
			}
		}
	}

}
