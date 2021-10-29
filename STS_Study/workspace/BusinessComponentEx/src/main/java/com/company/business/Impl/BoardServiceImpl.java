package com.company.business.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.business.board.BoardDO;
import com.company.business.board.BoardService;
/*
 * 구현 클래스이다.
 * 어느 클래스 선언부 위에 @Service 어노테이션을 붙이면
 * 이 클래스는 비즈니스 로직을 처리하는 클래스라고 스프링 컨테이너에게 알려준다.
 */

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public List<BoardDO> getBoardList(BoardDO boardDO) {
		return boardDAO.getBoardList(boardDO);
	}

	@Override
	public BoardDO getBoard(BoardDO boardDO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertBoard(BoardDO boardDO) {
		boardDAO.insertBoard(boardDO);
	}

	@Override
	public void updateBoard(BoardDO boardDO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(BoardDO boardDO) {
		// TODO Auto-generated method stub
		
	}

}
