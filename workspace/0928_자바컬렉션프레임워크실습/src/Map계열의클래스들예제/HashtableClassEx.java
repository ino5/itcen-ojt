package Map계열의클래스들예제;

import java.util.Hashtable;
import java.util.Scanner;

public class HashtableClassEx {
	public static void main(String[] args) {
		String[] userID = {"Lee", "Kim", "Jang", "Wang", "Ha"};
		String[] password = {"L123", "K456", "J234", "W896", "H567"};
		
		// Hashtable 객체 생성
		Hashtable<String, String> ht = new Hashtable<String, String> (userID.length);
		
		/* 객체 저장 */
		for (int i = 0; i < userID.length; i++) {
			ht.put(userID[i], password[i]);
		}
		System.out.println(ht);
		// {Jang=J234, Ha=H567, Lee=L123, Wang=W896, Kim=K456}
		
		boolean FLAG = true; // 스위치 변수는 대문자로
		
		while(FLAG) {	// 무한 루프
			System.out.print("유저 ID는 >>> ");
			Scanner in = new Scanner(System.in);
			String user_key = in.nextLine();
			String pw_value = ht.get(user_key);
			
			if (pw_value != null) {
				System.out.print("유저 PASSWORD는 >>> ");
				String passwordInputValue = in.nextLine();
				
				if (pw_value.equals(passwordInputValue)) {
					System.out.println("인증 성공!!");
				} else {
					System.out.println("인증 실패!!");
				}
			} else {
				System.out.println("입력한 유저 ID는 등록되어 있지 않습니다.!!");
			}
		}
				
	}
}
