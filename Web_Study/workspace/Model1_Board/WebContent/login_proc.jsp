<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp" %>
<!-- 추가 -->
<%@ page import="user.UserDO" %>
<%@ page import="user.UserDAO" %>

<%
	// 1. 사용자 입력 정보 추출
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	// 2. UserDO 클래스 객체 생성 후 멤버변수에 값 초기화
	UserDO userDO = new UserDO();
	userDO.setId(id);
	userDO.setPassword(password);
	
	// 3. UserDAO 클래스 객체 생성 후 getUser(userDO) 메소드 호출하면서 userDO 객체를 넘겨준다.
	UserDAO userDAO = new UserDAO();
	UserDO user = userDAO.getUser(userDO);
	
	// 화면 네비게이션(포워딩)
	if (user != null) { // 로그인 인증 성공인 경우
		session.setAttribute("IdKey", id);
		response.sendRedirect("getBoardList.jsp");
		// out.println("<script>alert('로그인 성공');</script>");
	} else { // 로그인 인증 실패인 경우
		response.sendRedirect("login.jsp");
		// out.println("<script>alert('로그인 실패');</script>");
	}
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login_proc.jsp => 로그인 컨트롤러 페이지</title>
</head>
<body>

</body>
</html>