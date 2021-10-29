package com.company.business.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {
	public static void main(String[] args) {
		// 1. 스프링 컨테이너 구동
		AbstractApplicationContext container 
			= new GenericXmlApplicationContext("applicationContext.xml");
		
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		// 2. 게시글 등록 테스트
		BoardDO boardDO = new BoardDO();
		boardDO.setTitle("스프링 어노테이션 기반 개발");
		boardDO.setWriter("김종오");
		boardDO.setContent("어노테이션 개념 학습");
		boardService.insertBoard(boardDO);
		
		// 3. 게시글 전체 목록 보기를 콘솔창에서 확인
		List<BoardDO> boardList = boardService.getBoardList(boardDO);
		
		for (BoardDO board : boardList) {
			System.out.println("---> " + board.toString());
		}
		
		// 4. 스프링 컨테이너 종료
		container.close();
	}
}
