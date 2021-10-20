<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인폼 페이지 </title>
</head>
<body>
	<form name="loginForm" method="POST" action="authentication.jsp">
		<label for="id">아이디</label>
		<input type="text" name="id"/>
		<br>
		<label for="pw">패스워드</label>
		<input type="password" name="pw"/>
		<br><br>
		<input type="submit" value="로그인"/>
	</form>
</body>
</html>