<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp 페이지</title>
<style>
	#div_box {
		position: absolute;
		top:10%;
		left:40%;
	}
</style>
</head>
<body>
	<div id="div box">
		<h1>로그인</h1>
		<form name="loginForm" action="login.do">
			<table border="1" cellpading="0" cellspacing="0">
				<tr>
					<td bgcolor="orange">아이디</td>
					<td><input type="text" name="id"/></td>
				</tr>
				
				<tr>
					<td bgcolor="orange">패스워드</td>
					<td><input type="password" name="password"/></td>
				</tr>
				
				<tr>
	               <td colspan="2" align="center">
	                  <input type="submit" value="로그인"/>
	               </td>
	            </tr>
			</table>
		</form>
		<br>
		<div>
			<span><a href="insertUser.jsp">회원가입</a></span>
		</div>
	</div>
</body>
</html>