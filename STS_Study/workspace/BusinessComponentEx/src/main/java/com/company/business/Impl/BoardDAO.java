package com.company.business.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.company.business.board.BoardDO;
import com.company.business.common.JDBCUtil;

/*
 * 어느 클래스 선언부 위에 @Repositoty 어노테이션을 붙이면
 * 이 클래스는 데이터베이스 연동을 처리하는 클래스라고 스프링 컨테이너에게 알려준다.
 */

@Repository
public class BoardDAO {
	private Connection			conn = null;
	private PreparedStatement	pstmt = null;
	private ResultSet			rs = null;
	
	public List<BoardDO> getBoardList(BoardDO boardDO) {
		System.out.println("===> getBoardList() 처리");
		
		List<BoardDO> boardList = new ArrayList<BoardDO>();
		
		try {
			conn = JDBCUtil.getConnection();
			String SELECT_BOARD = "select * from board order by seq desc";
			
			pstmt = conn.prepareStatement(SELECT_BOARD);
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
	
	public void insertBoard(BoardDO boardDO) {
		System.out.println("===> insertBoard() 처리");
		
		try {
			conn = JDBCUtil.getConnection();
			
			String BOARD_INSERT = "insert into board(seq, title, writer, content) "
									+ "values((select nvl(max(seq), 0) + 1 "
									+ "from board), ?, ?, ?)";
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
