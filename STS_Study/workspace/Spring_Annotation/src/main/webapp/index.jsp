<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp 페이지</title>
<style>
   h1 {
      text-align:center;
   }
   
   #menu {
      list-style:none;
      height:40px;
      padding:5px 1px;
      margin:0;
      background:orange;
   }
   
   #menu li {
      float:left;
      position:relative;
      margin:5px 150px;
      padding:0;
   }
   
   #menu li a {
      display:block;
      font-weight:bold;
      font-size:18px;
      color: black;
      text-decoration:none;
   }
   
   
</style>
</head>
<body>
   <h1>스프링 프레임워크와 Mybatis 프레임워크 연동</h1>
   <ul id="menu">
      <li><a href="login.jsp">로그인 </a><br><br><br></li>
      <li><a href="insertBoard.jsp">회원가입</a><br><br><br></li>
      <li><a href="getBoardList.do">게시글 전체 목록 보기</a><br><br><br></li>
      <li><a href="dataTransform.do">게시글 목록 변환처리(JSON)</a></li>
   </ul>
   
</body>
</html>