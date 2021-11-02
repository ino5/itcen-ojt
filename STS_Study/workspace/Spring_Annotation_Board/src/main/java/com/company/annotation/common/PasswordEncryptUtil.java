package com.company.annotation.common;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 자바에서 SHA 알고리즘을 사용하려면 MessageDigest 클래스를 이용한다.
 * update() 메소드를 호출할 때마다 객체 내에 저장된 digest 값이 계속해서 갱신된다.
 * 최종적으로 digetst() 메소드를 호출하면 그 값을 가져올 수 있다.
 */


public class PasswordEncryptUtil {
	// 패스워드를 암호화 시키는 메소드 구현
	public static String encryptSHA256(String plainText) {
		// 패스워드 지정
		// String plainText = "test1234";	// 평문(plainText)
		String sha256 = "";
		
		try {
			// MessageDigest 클래스의 getInstance() 메소드의 매개변수에 "SHA-256" 알고리즘 이름을
			// 지정함으로써 해당 알고리즘에서 해시값을 계산하는 MessageDigest를 구할 수 있다.
			MessageDigest mdSHA256 = MessageDigest.getInstance("SHA-256");
			
			// 데이터(패스워드 평문)를 해쉬한다. 즉 '암호화' 한다와 유사한 개념이다.
			mdSHA256.update(plainText.getBytes("UTF-8"));
			
			// 바이트 배열로 해시를 반환한다.
			byte[] sha256Hash = mdSHA256.digest();
			System.out.println("length of bytes: " + sha256Hash.length); // 32 (256/8)
			
			// StringBuffer 객체는 계속해서 append를 해도 객체는 오직 하나만 생성된다. 메모리낭비 개선
			StringBuffer hexSHA256Hash = new StringBuffer();
			
			// 256비트로 생성 => 32Byte => 1Byte(8bit) => 16진수 2자리로 변환 => 16진수 한자리는 4bit
			for (byte b : sha256Hash) {
				String hexString = String.format("%02x", b);
				hexSHA256Hash.append(hexString);
			}
			sha256 = hexSHA256Hash.toString();
			System.out.println("length of hex: " + sha256.length()); // 64 (32*2)
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}	
		
		return sha256;
	}
	
	
}
