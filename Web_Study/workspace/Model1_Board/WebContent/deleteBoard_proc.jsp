<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
    
<!-- 자바 클래스 임포트 -->
<%@ page import="board.BoardDO" %>
<%@ page import="board.BoardDAO" %>

<%
	request.setCharacterEncoding("UTF-8");

	String seq = request.getParameter("seq");

	
	BoardDO boardDO = new BoardDO();
	boardDO.setSeq(Integer.parseInt(seq));
	
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.deleteBoard(boardDO);
	
	response.sendRedirect("getBoardList.jsp");
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>deleteBoard_proc.jsp => "삭제" 처리 컨트롤러 페이지</title>
</head>
<body>

</body>
</html>