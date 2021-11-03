<%@page import="com.company.annotation.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="com.company.annotation.board.*" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<title>getBoardList 페이지</title>
</head>
<body>
	<center>
		<h3>${userName}님 환영합니다.&nbsp;&nbsp;&nbsp;<a href="logout.do">로그아웃</a></h3>
		<form name="myForm" method="POST" action="getBoardList.do">
			<p>총 게시글: ${boardList.size() } 건 </p>
			<table border="1" cellpadding="0" cellspacing="0" width="700">
				<tr>
					<td align="right">
						<select name="searchCondition">
							<option value="TITLE">제목</option>
							<option value="WRITER">작성자</option>
							<input name="searchKeyword" type="text" />
							<input type="submit" value="검색" />
						</select>
					</td>
				</tr>
			</table>
		</form>
		<table border="1" cellpadding="0" cellspacing="0" width="700">
			<tr>
				<th bgcolor="orange" width="100">번호</th>
				<th bgcolor="orange" width="200">제목</th>
				<th bgcolor="orange" width="150">작성자</th>
				<th bgcolor="orange" width="150">등록일</th>
				<th bgcolor="orange" width="100">조회수</th>
			</tr>	
			<%--
			<%
				for(BoardDO board : boardList){
			%>
				<tr>
					<td align="center"><%= board.getSeq() %></td>
					<td align="left"><a href="getBoard.jsp?seq=<%= board.getSeq()%>"><%=board.getTitle() %></a></td>
					<td align="center"><%= board.getWriter() %></td>
					<td align="center"><%= board.getRegdate()%></td>
					<td align="center"><%= board.getCnt() %></td>
				</tr>
			<%
				}
			%>
			 --%>
			 
			 <%-- 위 소스를 표현 언어와 JSTL을 적용하여 소스 변경 --%>
			 <c:forEach items="${boardList}" var="board">
			 	<tr>
					<td align="center">${board.seq}</td>
					<td align="left"><a href="getBoard.do?seq=${board.seq}">${board.title}</a></td>
					<td align="center">${board.writer}</td>
					<td align="center">${board.regdate}</td>
					<td align="center">${board.cnt}</td>
				</tr>
			 </c:forEach>
		</table>
		<br><br>
		<a href="insertBoard.jsp">새 게시글 등록</a>
		<a href="getBoardList.do">전체 게시글 이동</a>
	</center>
</body>
</html>