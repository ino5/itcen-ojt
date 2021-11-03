package com.company.view.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.annotation.board.BoardDAO;
import com.company.annotation.board.BoardDO;

/**
 * 
 * 커맨드(command) 객체란?
 * => 클라이언트가 보내주는 파라미터가 자동으로 담겨서 반환되는 객체를 말한다.
 * 	  이는 '자동 객체 변환' 이라고도 하며, MVC 디자인 패턴에서 가장 큰 핵심 기술 중에
 * 	 하나이다.
 * 스프링에서는 @RequestMapping을 이용하여 HandlerMapping 설정을 대체한다.
 */

@Controller
public class BoardController {	// 통합 컨트롤러
	@Autowired
	BoardDAO boardDAO;
	
	// 전체 게시글 목록 검색
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardDO boardDO, Model model) {
		model.addAttribute("boardList", boardDAO.getBoardList(boardDO));
		return "getBoardList.jsp";
	}
	
	// 게시글 상세보기
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardDO boardDO, Model model) {
		model.addAttribute("board", boardDAO.getBoard(boardDO));
		return "getBoard.jsp";
	}
	
	// [힌트] DML 작업 시에는 BoardDO boardDO, BoardDAO boardDAO만 커맨드 객체로 받으면 된다.
	// 게시글 등록
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardDO boardDO) {
		boardDAO.insertBoard(boardDO);
		return "redirect:getBoardList.do";
	}
	
	// 게시글 수정
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardDO boardDO) {
		boardDAO.updateBoard(boardDO);
		return "redirect:getBoardList.do";
	}

	// 게시글 삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardDO boardDO) {
		boardDAO.deleteBoard(boardDO);
		return "redirect:getBoardList.do";
	}	
}
