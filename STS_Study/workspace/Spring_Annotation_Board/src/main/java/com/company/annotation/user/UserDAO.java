package com.company.annotation.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.company.annotation.common.JDBCUtil;
import com.company.annotation.common.PasswordEncryptUtil;


public class UserDAO {
	// DB 관련 변수 선언
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	// 추가
	// 회원 가입 시 패스워드를 암호화 시킨 데이터를 저장할 참조변수 선언
	String pwEncrypt;
	
	
	// SQL 명령어
	private final String USER_GET = "select * from users where id= ? and password = ?";
	// 추가
	private final String USERS_INSERT = "INSERT INTO users VALUES (?, ?, ?, ?, ?)";
	
	// 로그인 user 조회(select) 메소드 구현
	public UserDO getUser(UserDO userObj) {
		UserDO user = null;
		
		try {
			System.out.println("===> JDBC로 getUser() 기능 처리");
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(USER_GET);
			pstmt.setString(1, userObj.getId());
			pstmt.setString(2, userObj.getPassword());
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				user = new UserDO();
				user.setId(rs.getString("ID"));
				user.setPassword(rs.getString("PASSWORD"));
				// 추가
				user.setName(rs.getString("NAME"));
				user.setRole(rs.getString("ROLE"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return user;
	} // end getUser() ===============================================
	
	// 회원가입 insert 메소드 구현
	public void insertUser(UserDO userDO) {
		System.out.println("===> insertUser() 기능 처리");
		
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(USERS_INSERT);
			pstmt.setString(1, userDO.getId());
			pstmt.setString(2, userDO.getPassword());
			
			// 넘어온 패스워드를 암호화 시켜서 세번째 물음표값으로 지정한다.
			String plainText = userDO.getPassword();
			pwEncrypt = PasswordEncryptUtil.encryptSHA256(plainText);
			pstmt.setString(3, pwEncrypt);
			pstmt.setString(4, userDO.getName());
			pstmt.setString(5, userDO.getRole());
			pstmt.executeUpdate();
		} catch(Exception e) {
			System.out.println("insertUser() :" + e);
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
	}
}