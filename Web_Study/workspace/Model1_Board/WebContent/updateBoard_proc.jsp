<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
    
<!-- 자바 클래스 임포트 -->
<%@ page import="board.BoardDO" %>
<%@ page import="board.BoardDAO" %>

<%
	request.setCharacterEncoding("UTF-8");

	String seq = request.getParameter("seq"); // seq는 hidden 객체로 넘어온 파라미터이다.
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	
	BoardDO boardDO = new BoardDO();
	boardDO.setSeq(Integer.parseInt(seq));
	boardDO.setTitle(title);
	boardDO.setContent(content);
	
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.updateBoard(boardDO);
	
	response.sendRedirect("getBoardList.jsp");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updateBoard_proc.jsp => 수정 컨트롤러 페이지</title>
</head>
<body>

</body>
</html>