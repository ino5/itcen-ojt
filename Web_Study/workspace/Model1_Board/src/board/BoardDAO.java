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
	} // end getBoardList() =======================================
	
	// 게시글번호 조건에 맞는 해당 게시글만 검색하는 메소드
	public BoardDO getBoard(BoardDO boardDO) {
		System.out.println("===> getBoard() 처리됨!");
		
		BoardDO board = null;
		
		try {
			conn = JDBCUtil.getConnection();
			
			// [중요] 해당 게시글의 조회수(cnt)를 1증가 시킨다.
			String UPDATE_CNT = "UPDATE board SET cnt = cnt + 1 WHERE seq = ?";
			pstmt = conn.prepareStatement(UPDATE_CNT);
			pstmt.setInt(1, boardDO.getSeq());
			pstmt.executeUpdate();	// DML 작업 시에는 executeUpdate() 메소드 호출
			
			// 그런 다음 해당 게시글 가져오기
			String BOARD_GET = "SELECT * FROM board WHERE seq = ?";
			pstmt = conn.prepareStatement(BOARD_GET);
			pstmt.setInt(1, boardDO.getSeq());
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				board = new BoardDO();
				
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getString("TITLE"));
				board.setWriter(rs.getString("WRITER"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegdate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return board;
	} // end getBoard() =================================================
	
	// 게시글 수정 처리 메소드
	public void updateBoard(BoardDO boardDO) {
		System.out.println("===> updateBoard() 처리됨!");
		
		try {
			conn = JDBCUtil.getConnection();
			
			String BOARD_UPDATE = "UPDATE board SET title=?, content=? WHERE seq=?";
			
			pstmt = conn.prepareStatement(BOARD_UPDATE);
			pstmt.setString(1, boardDO.getTitle());
			pstmt.setString(2, boardDO.getContent());
			pstmt.setInt(3, boardDO.getSeq());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
	} // end updateBoard() ========================================
	
	// 게시글 삭제
	public void deleteBoard(BoardDO boardDO) {
		System.out.println("===> updateBoard() 처리됨!");
		
		try {
			conn = JDBCUtil.getConnection();
			
			String BOARD_DELETE = "DELETE FROM board WHERE seq=?";
			
			pstmt = conn.prepareStatement(BOARD_DELETE);
			pstmt.setInt(1, boardDO.getSeq());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
	} // end deleteBoard() ==========================================
	
	public void insertBoard(BoardDO boardDO) {
		System.out.println("===> insertBoard() 처리됨!");
		
		try {
			conn = JDBCUtil.getConnection();
			
			String BOARD_INSERT
				= "INSERT INTO board(seq, title, writer, content) VALUES((SELECT NVL(MAX(seq),0)+1 FROM board), ?, ?, ?)";
			pstmt = conn.prepareStatement(BOARD_INSERT);
			pstmt.setString(1, boardDO.getTitle());
			pstmt.setString(2, boardDO.getWriter());
			pstmt.setString(3, boardDO.getContent());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
	}
}
