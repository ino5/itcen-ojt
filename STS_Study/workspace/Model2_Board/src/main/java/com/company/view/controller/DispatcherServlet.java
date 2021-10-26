package com.company.view.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.Model2_Board.board.BoardDAO;
import com.company.Model2_Board.board.BoardDO;
import com.company.Model2_Board.user.UserDAO;
import com.company.Model2_Board.user.UserDO;

/**
 * Servlet implementation class DispatcherServlet
 */
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	// 생성자
    public DispatcherServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response); // process(request, response) 메소드 호출
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		process(request, response); // process(request, response) 메소드 호출
	}
	
	// 사용자 정의 메소드 구현 => [중요]
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//(예) String url = "http://localhost:8080/Model2_Board/login.do";
		// 1. 클라이언트의 요청 path 정보를 추출한다.
		String uri = request.getRequestURI();
		String filePath = uri.substring(uri.lastIndexOf("/")); // "/login.do" 얻어옴!
		
		//2. 클라이언트의 요청 filePath에 따라 적절히 분기 처리한다.
		if (filePath.equals("/login.do")) {
			System.out.println("로그인 처리됨!");
			
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			
			UserDO userDO = new UserDO();
			userDO.setId(id);
			userDO.setPassword(password);
			
			UserDAO userDAO = new UserDAO();
			UserDO user = userDAO.getUser(userDO);
			
			if (user != null) {
				HttpSession session = request.getSession();
				session.setAttribute("IdKey", id);
				// System.out.println("로그인 성공");
				response.sendRedirect("getBoardList.do");
			} else {
				// System.out.println("로그인 실패");
				response.sendRedirect("login.jsp");
			} 
		} else if (filePath.equals("/getBoardList.do")) {
			System.out.println("전체 게시글 목록 보기 처리됨!");
			
			String searchField = "";
			String searchText = "";
			
			if (request.getParameter("searchCondition") != "" && 
					request.getParameter("searchKeyword") != "") {
				searchField = request.getParameter("searchCondition");
				searchText = request.getParameter("searchKeyword");
			}
			
			BoardDAO boardDAO = new BoardDAO();
			List<BoardDO> boardList = boardDAO.getBoardList(searchField, searchText);
			
			
			// 검색 결과를 세션에 저장
			HttpSession session = request.getSession();
			session.setAttribute("boardList", boardList);
			
			// 포워딩(응답)
			response.sendRedirect("getBoardList.jsp");
		} else if (filePath.equals("/getBoard.do")) {
			System.out.println("게시글 상세보기 처리");
			
			String seq = request.getParameter("seq");
			
			BoardDO boardDO = new BoardDO();
			boardDO.setSeq(Integer.parseInt(seq));
			
			BoardDAO boardDAO = new BoardDAO();
			BoardDO board = boardDAO.getBoard(boardDO);
			HttpSession session = request.getSession();
			session.setAttribute("board", board);
			
			// 포워딩
			response.sendRedirect("getBoard.jsp");
		} else if (filePath.equals("/insertBoard.do")) {
			System.out.println("게시글 입력 처리됨!");
			
			String title = request.getParameter("title");
			String writer = request.getParameter("writer");
			String content = request.getParameter("content");
			
			BoardDO boardDO = new BoardDO();
			boardDO.setTitle(title);
			boardDO.setWriter(writer);
			boardDO.setContent(content);
			
			BoardDAO boardDAO = new BoardDAO();
			boardDAO.insertBoard(boardDO);
			
			//포워딩
			response.sendRedirect("getBoardList.do");
		} else if (filePath.equals("/updateBoard.do")) {
			System.out.println("게시글 수정 처리됨!");
			
			request.setCharacterEncoding("UTF-8");
			
			String seq = request.getParameter("seq");
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			BoardDO boardDO = new BoardDO();
			boardDO.setSeq(Integer.parseInt(seq));
			boardDO.setTitle(title);
			boardDO.setContent(content);
			
			BoardDAO boardDAO = new BoardDAO();
			boardDAO.updateBoard(boardDO);
			
			// 포워딩
			response.sendRedirect("getBoardList.do");
		} else if (filePath.equals("/deleteBoard.do")) {
			System.out.println("게시글 삭제 처리됨!");
			
			String seq = request.getParameter("seq");
			
			BoardDO boardDO = new BoardDO();
			boardDO.setSeq(Integer.parseInt(seq));
			
			BoardDAO boardDAO = new BoardDAO();
			boardDAO.deleteBoard(boardDO);
			
			// 포워딩
			response.sendRedirect("getBoardList.do");
		} else if (filePath.equals("/logout.do")) {
			System.out.println("로그아웃 처리됨!");
			
			HttpSession session = request.getSession();
			session.invalidate();
			
			response.sendRedirect("login.jsp");
		}
	}

}
