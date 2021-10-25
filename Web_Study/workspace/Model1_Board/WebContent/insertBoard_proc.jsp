<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
    
<!-- 자바 클래스 임포트 -->
<%@ page import="board.BoardDO" %>    
<%@ page import="board.BoardDAO" %>  
    
<%
	request.setCharacterEncoding("UTF-8");

	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	
	BoardDO boardDO = new BoardDO();
	boardDO.setTitle(title);
	boardDO.setWriter(writer);
	boardDO.setContent(content);
	
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.insertBoard(boardDO);
	
	// 포워딩
	response.sendRedirect("getBoardList.jsp");
	
%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insertBoard_proc.jsp 페이지 => 게시글 등록 컨트롤러 페이지</title>
</head>
<body>

</body>
</html>