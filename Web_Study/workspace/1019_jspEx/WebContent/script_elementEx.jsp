<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 페이지의 자바스크립트 요소</title>
</head>
<body>
	<h2>선언문, 스크립트릿, 표현식 사용 예제</h2>
	<%! // 선언문 => 전역변수 선언 시 사용
		String str1 = "전역 변수입니다.";
	%>
	
	<%! // 선언문 => 메소드 선언 시 사용
		String getStr() {
			return str1;
		}
	%>
	
	<% // 스크립트릿 => 자바 코드 기술 시 사용
		String str2 = "지역 변수입니다.";
	%>
	
	스크립트릿에서 선언한 변수 str2는 <%= str2 %><br>
	선언문에서 선언한 변수 str1은 <%= getStr() %>
</body>
</html>