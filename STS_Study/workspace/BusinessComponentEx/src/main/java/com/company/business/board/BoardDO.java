package com.company.business.board;

/*
 * 개발자가 구현하는 모든 클래스는 최상위 클래스인 Object 클래스로부터 상속을 받는다.
 * 그러므로 Object 클래스의 모든 메소드를 BoardDO 자식 클래스에서 @Override 즉 재정의하여 사용할 수 있다.
 */
import java.sql.Date;

public class BoardDO {
	private int seq;			// 게시글번호
	private String title;		// 제목
	private String writer;		// 작성자
	private String content;		// 게시글내용
	private Date regdate;		// 작성일자
	private int cnt;			// 조회수
	
	// 멤버변수 하나당 getter, setter 메소드
	public int getSeq() {return seq;}
	public void setSeq(int seq) {this.seq = seq;}
	
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	
	public String getWriter() {return writer;}
	public void setWriter(String writer) {this.writer = writer;}
	
	public String getContent() {return content;}
	public void setContent(String content) {this.content = content;}
	
	public Date getRegdate() {return regdate;}
	public void setRegdate(Date regdate) {this.regdate = regdate;}
	
	public int getCnt() {return cnt;}
	public void setCnt(int cnt) {this.cnt = cnt;}
	
	@Override
	public String toString() {
		return "BoardDO [seq=" + seq + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regdate="
				+ regdate + ", cnt=" + cnt + ", toString()=" + super.toString() + "]";
	}
	
	
}