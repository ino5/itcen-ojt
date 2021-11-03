<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!-- 추가 -->
 <%@ page errorPage="error.jsp" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getBoard.jsp 페이지</title>
</head>
<body>
	<center>
		<h1>게시글 상세보기</h1>
		<a href="logout.do"></a>
		<hr>
		<form name="getBoardForm" method="POST" action="updateBoard.do">
			<input type="hidden" name="seq" value="${board.getSeq() }" />
			<table border="1" cellpdding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">제목</td>
					<td>
						<input type="text" name="title" value="${board.getTitle()}"/>
					</td>
				</tr>
				
				<tr>
					<td bgcolor="orange">작성자</td>
					<td align="left">${board.getWriter()}</td>
				</tr>
				
				<tr>
					<td bgcolor="orange">내용</td>
					<td align="left">
						<textarea rows="10" cols="40"  name="content">${board.getContent() }</textarea>
					</tr>
				</tr>
				
				<tr>
					<td bgcolor="orange">등록일</td>
					<td align="left">"${board.getRegdate() }"</td>
				</tr>
				<tr>
					<td bgcolor="orange">조회수</td>
					<td align="left">"${board.getCnt() }"</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="글 수정" />
					</td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="insertBoard.jsp">새 게시글 등록</a>
		<a href="deleteBoard.do?seq=${board.getSeq()}">게시글 삭제</a>&nbsp;&nbsp;&nbsp;
		<a href="getBoardList.do">전체 게시글 목록 보기</a>
	</center> 
</body>
</html>