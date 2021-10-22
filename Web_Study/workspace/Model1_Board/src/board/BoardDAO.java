package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.JDBCUtil;

public class BoardDAO {
	// DB 관련 변수 선언
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	// 전체 게시글 목록 조회 메소드
	public List<BoardDO> getBoardList(String searchField, String searchText) {
		System.out.println("===> getBoardList() 기능 처리됨!");
		System.out.println("searchField: " + searchField + " " + "searchText: " + searchText);
		
		List<BoardDO> boardList = new ArrayList<BoardDO>(); // 가변 배열 객체 생성
		
		try {
			conn = JDBCUtil.getConnection();
			
			/*
	         * [중요] 게시물 검색 시 => '제목' or '작성자'로 검색 조건 제시하는 SQL문장 어떻게 작성??
	         *        하나의 SQL문장을 두 가지 용도로 사용함
	         *        "select * from board " + where + " order by seq desc";
	         *        검색 조건이 없는 경우는 모든 레코드를 검색하고, 
	         *        검색 조건이 매개변수로 넘어온 경우에는 조건에 만족하는 레코드만 검색하겠다.
	         */
			
			String where = "";
			
			if (searchField != null && searchText != null) {
				where = "where " + searchField + " like '%" + searchText + "%'";
			}
			String Condition_SQL = "select * from board " + where + " order by seq desc";
//			String Condition_SQL = "select * from board";
			pstmt = conn.prepareStatement(Condition_SQL);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				BoardDO board = new BoardDO();
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getString("TITLE"));
				board.setWriter(rs.getString("WRITER"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegdate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
				
				boardList.add(board);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		
		return boardList;
	}
}
