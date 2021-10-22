<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mybatis.dao.EmpDAO" %>

<%
	request.setCharacterEncoding("UTF-8");
	
	String empno = request.getParameter("empno");
	
	int cnt = EmpDAO.delete(empno);
	
	response.sendRedirect("total.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>