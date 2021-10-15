<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  추가 -->
<%-- <% request.setCharacterEncoding("EUC-KR"); %> --%>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="mem" scope="page" class="member.DBBean" />

<%
	String mem_id = request.getParameter("mem_id");
	int idCheck = mem.confirmId(mem_id);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="0" align="center">
		<tr>
			<td algin="center">
			<%
				if (idCheck == 1) { // ID가 중복된 경우
			%>
			<br>
			<%= mem_id %> 는 이미 존재하는 ID입니다.&nbsp;<br><br>			
			<input type="button" value="닫기" onClick="javascript:self.close();
			       opener.document.memberForm.mem_id.focus();"/>

			<% 
				} else {
			%>
			<br>
			<%= mem_id %> 는 사용 가능한 ID입니다.&nbsp;<br><br>
			<input type="button" value="닫기" onClick="javascript:self.close();
			       opener.document.memberForm.mem_passwd.focus();"/>
			<% 
				}
			%>
			</td>
		</tr>
	</table>
</body>
</html>