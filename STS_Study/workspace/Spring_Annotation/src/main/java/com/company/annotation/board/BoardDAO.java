package com.company.annotation.board;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class BoardDAO {
	
	@Autowired
	private SqlSession mybatis;
	
	// 전체 게시글 목록 조회 메소드
	public List<BoardDO> getBoardList(BoardDO boardDO) {
		
		return mybatis.selectList("BoardDAO.getBoardList", boardDO);
	} 
	
	// 게시글번호 조건에 맞는 해당 게시글만 검색하는 메소드
	public BoardDO getBoard(BoardDO boardDO) {
	
		return mybatis.selectOne("BoardDAO.getBoard", boardDO);
	} 
	
	// 게시글 수정 처리 메소드
	public void updateBoard(BoardDO boardDO) {
		mybatis.update("BoardDAO.updateBoard", boardDO);
		
	} 
	
	// 게시글 삭제
	public void deleteBoard(BoardDO boardDO) {
		mybatis.delete("BoardDAO.deleteBoard", boardDO);
		
	}
	
	public void insertBoard(BoardDO boardDO) {
		mybatis.insert("BoardDAO.insertBoard", boardDO);
		
	}
}