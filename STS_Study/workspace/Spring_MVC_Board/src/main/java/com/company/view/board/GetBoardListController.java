package com.company.view.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.company.Spring_MVC_Board.board.BoardDAO;
import com.company.Spring_MVC_Board.board.BoardDO;

public class GetBoardListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		
		System.out.println("전체 게시글 목록 보기 처리");
		
		String searchField = "";
		String searchText = "";
		
		if (request.getParameter("searchCondition") != ""
							&& request.getParameter("searchKeyword") != "") {
			searchField = request.getParameter("searchCondition");
			searchText = request.getParameter("searchKeyword");
		}
		BoardDO boardDO = new BoardDO();
		BoardDAO boardDAO = new BoardDAO();
		List<BoardDO> boardList = boardDAO.getBoardList(searchField, searchText);
		
		// ModelAndView 객체 생성
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("boardList", boardList);	// Model 정보 저장 즉 view에 전달할 값을 설정	
		// 포워딩
		//		/WEB-INF/board/getBoardList.jsp 페이지로 응답
		mav.setViewName("getBoardList");	// View 정보 저장 즉 응답할 view 이름 설정
		
		return mav;
	}	
}
