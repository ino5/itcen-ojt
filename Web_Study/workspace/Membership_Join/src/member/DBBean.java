package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBBean {
	// 멤버변수(프로퍼티, 중간 저장소) 선언
	private String mem_id;
	private String mem_passwd;
	private String mem_name;
	private String mem_nickname;
	private String mem_email_id; 		// 이메일 아이디
	private String mem_email_domain; 	// 이메일 도메인
	private String mem_num1;			// 주민번호 앞자리
	private String mem_num2;			// 주민번호 뒤자리
	private String mem_phone;
	private String mem_gender;
	private int mem_Birthday1;			// 출생년도
	private int mem_Birthday2;			// 출생월
	private int mem_Birthday3;			// 출생일
	private String mem_job;
	private String zipCode;			// 우편번호
	private String userAddr1;			// 주소
	private String userAddr2;			// 상세주소
	private String userAddr3;			// 주소 참고항목
	
	// 오라클 DB 연동에 관련된 변수 선언
	Connection 				conn = null;
	PreparedStatement		pstmt = null;
	ResultSet				rs = null;
	
	// 오라클 JDBC 연동을 위한 driver, url 설정
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	// DB 연동 메소드 구현
	public void connect() {
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "testdb", "testdb1234");
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	// DB 연동 종료 메소드 구현
	public void disconnect() {
		try {
			pstmt.close();
			conn.close();
			rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// ID 중복 체크 메소드 구현
	public int confirmId(String mem_id) {
		connect();
		int idDuplication = 0; // id 중복 여부 체크 변수
		
		try {
			String confirmed_SELECT = "select mem_id from member where mem_id=?";
			pstmt = conn.prepareStatement(confirmed_SELECT);
			pstmt.setString(1, mem_id);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				idDuplication = 1; // ID 값이 중복인 경우
			} else {
				idDuplication = -1; // 사용 가능한 ID인 경우
			}
		} catch(Exception e) {
			System.out.println("confirmId(): " + e);
		} finally {
			disconnect(); // 자원 해제
		}
		return idDuplication;
	}
	
	// 회원 가입 폼에서 입력한 데이터들을 member 테이블에 저장하는 메소드 구현
	public boolean insertDB() {
		connect();
		
		try {
			String MEMBER_INSERT = "insert into member values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
			pstmt = conn.prepareStatement(MEMBER_INSERT);
			
			String mem_email = mem_email_id + "@" + mem_email_domain;
			pstmt.setString(1, mem_id);
			pstmt.setString(2, mem_passwd);
			pstmt.setString(3, mem_name);
			pstmt.setString(4, mem_nickname);
			pstmt.setString(5, mem_email);
			pstmt.setString(6, mem_num1);
			pstmt.setString(7, mem_num2);
			pstmt.setString(8, mem_phone);
			pstmt.setString(9, mem_gender);
			pstmt.setInt(10, mem_Birthday1);
			pstmt.setInt(11, mem_Birthday2);
			pstmt.setInt(12, mem_Birthday3);
			pstmt.setString(13, mem_job);
			pstmt.setString(14, zipCode);
			pstmt.setString(15, userAddr1);
			pstmt.setString(16, userAddr2);
			pstmt.setString(17, userAddr3);
			
			pstmt.executeUpdate(); // DML 작업 시에는 executeUpdate() 호출 => insert, update, delete
			
		} catch (Exception e) {
			System.out.println("insertDB(): " + e);
		} finally {
			disconnect();
		}
		return true;
	}
	
	// 멤버변수 하나당 setter, getter 메소드
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_passwd() {
		return mem_passwd;
	}
	public void setMem_passwd(String mem_passwd) {
		this.mem_passwd = mem_passwd;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_nickname() {
		return mem_nickname;
	}
	public void setMem_nickname(String mem_nickname) {
		this.mem_nickname = mem_nickname;
	}
	public String getMem_email_id() {
		return mem_email_id;
	}
	public void setMem_email_id(String mem_email_id) {
		this.mem_email_id = mem_email_id;
	}
	public String getMem_email_domain() {
		return mem_email_domain;
	}
	public void setMem_email_domain(String mem_email_domain) {
		this.mem_email_domain = mem_email_domain;
	}
	public String getMem_num1() {
		return mem_num1;
	}
	public void setMem_num1(String mem_num1) {
		this.mem_num1 = mem_num1;
	}
	public String getMem_num2() {
		return mem_num2;
	}
	public void setMem_num2(String mem_num2) {
		this.mem_num2 = mem_num2;
	}
	public String getMem_phone() {
		return mem_phone;
	}
	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}
	public String getMem_gender() {
		return mem_gender;
	}
	public void setMem_gender(String mem_gender) {
		this.mem_gender = mem_gender;
	}
	public int getMem_Birthday1() {
		return mem_Birthday1;
	}
	public void setMem_Birthday1(int mem_Birthday1) {
		this.mem_Birthday1 = mem_Birthday1;
	}
	public int getMem_Birthday2() {
		return mem_Birthday2;
	}
	public void setMem_Birthday2(int mem_Birthday2) {
		this.mem_Birthday2 = mem_Birthday2;
	}
	public int getMem_Birthday3() {
		return mem_Birthday3;
	}
	public void setMem_Birthday3(int mem_Birthday3) {
		this.mem_Birthday3 = mem_Birthday3;
	}
	public String getMem_job() {
		return mem_job;
	}
	public void setMem_job(String mem_job) {
		this.mem_job = mem_job;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getUserAddr1() {
		return userAddr1;
	}
	public void setUserAddr1(String userAddr1) {
		this.userAddr1 = userAddr1;
	}
	public String getUserAddr2() {
		return userAddr2;
	}
	public void setUserAddr2(String userAddr2) {
		this.userAddr2 = userAddr2;
	}
	public String getUserAddr3() {
		return userAddr3;
	}
	public void setUserAddr3(String userAddr3) {
		this.userAddr3 = userAddr3;
	}
	
	
	
}
