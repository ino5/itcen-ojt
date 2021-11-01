<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 추가 -->
<%@ page errorPage="error.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getBoard.jsp</title>
</head>
<body>
	<center>
		<h1>게시글 상세 보기</h1>
		<a href="logout.do">로그아웃</a>
		<hr>
		<form name="getBoardForm" method="POST" action="updateBoard.do">
			<input type="hidden" name="seq" value="${board.seq}"/>
			<table board="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">제목</td>
					<td>
						<input type="text" name="title" value="${board.title}"/>
					</td>
				</tr>
				
				<tr>
					<td bgcolor="orange">작성자</td>
					<td>
						<input type="text" name="writer" value="${board.writer}"/>
					</td>
				</tr>
				
				<tr>
					<td bgcolor="orange">내용</td>
					<td align="left">
						<textarea name="content" rows="10" cols="40">${board.content}</textarea>
					</td>
				</tr>
				
				<tr>
					<td bgcolor="orange">등록일</td>
					<td align="left">${board.regdate}</td>
				</tr>
				
				<tr>
					<td bgcolor="orange">조회수</td>
					<td align="left">${board.cnt}</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="글 수정"/>
					</td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="insertBoard.jsp">새 게시글 등록</a>
		<a href="deleteBoard.do?seq=${board.seq}">게시글 삭제</a> &nbsp;&nbsp;&nbsp;
		<a href="getBoardList.do">전체 게시글 목록 보기</a>
	</center>
</body>
</html>