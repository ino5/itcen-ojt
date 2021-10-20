<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>   

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ELJstl_view 페이지</title>
</head>
<body>
	<%-- [문제] 먼저 스크립트릿(<%  %>)과 표현식(<%= %>), request 객체, out 객체를 적용하여
		 코딩한다. 폼에서 넘어온 이름과 선택한 과목들을 크롬 브라우저에 출력하세요.
	
	--%>
	<%--
	<% String name = request.getParameter("name"); %>
	이름은 <%= name %>입니다.<br><br>
	
	선택한 과목은 <br>
	<%
		String[] langs = request.getParameterValues("lang");
		for (int i = 0; i < langs.length; i++) {
			out.println(langs[i] + "<br>");
		}
	%>
	--%>

	<%-- [문제] 표현언어와 JSTL을 적용하여 코딩한다. 
		  폼에서 넘어온 이름과 선택한 과목들을 크롬 브라우저에 출력하세요.
	--%>
	
	이름은 ${param.name} 입니다. <br><br>

	선택한 과목은<br>
	<c:forEach var="item" items="${paramValues.lang}">
		${item}<br>
	</c:forEach>
	
</body>
</html>