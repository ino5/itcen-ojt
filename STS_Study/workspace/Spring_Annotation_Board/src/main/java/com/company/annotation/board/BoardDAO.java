package com.company.annotation.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.annotation.common.JDBCUtil;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Repository
public class BoardDAO {
	@Autowired
	private SqlSession mybatis;
	
	// 전체 게시글 목록 조회 메소드
	public List<BoardDO> getBoardList(BoardDO boardDO) {
		System.out.println("===> getBoardList running .....");
		return mybatis.selectList("BoardDAO.getBoardList", boardDO);	
	}
	
	// 게시글번호 조건에 맞는 해당 게시글만 검색하는 메소드
	public BoardDO getBoard(BoardDO boardDO) {
		System.out.println("===> getBoard() 처리됨!");
		return mybatis.selectOne("BoardDAO.getBoard", boardDO);
	}
	
	// 게시글 수정 처리 메소드
	public void updateBoard(BoardDO boardDO) {
		System.out.println("===> updateBoard() 처리됨!");
		mybatis.update("BoardDAO.updateBoard", boardDO);
	}
	
	// 게시글 삭제 처리 메소드
	public void deleteBoard(BoardDO boardDO) {
		System.out.println("===> deleteBoard() 처리됨!");
		mybatis.delete("BoardDAO.deleteBoard", boardDO);
	}
	
	// 게시글 등록 처리 메소드
	public void insertBoard(BoardDO boardDO) {
		System.out.println("===> insertBoard() 처리됨!");
		mybatis.insert("BoardDAO.insertBoard", boardDO);
	}
}