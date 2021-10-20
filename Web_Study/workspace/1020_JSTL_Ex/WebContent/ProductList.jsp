<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 추가 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ProductList 페이지</title>
</head>
<body>
	<h2>제품 목록 보기</h2>
	<hr>
	<form name="myForm" method="POST" action="ProductSelect.jsp">
		<jsp:useBean id="pro" scope="page" class="Product.ProductTest" />
		<%-- 주석 => 브라우저에서 소스보기하면 주석이 보이지 않음!
		<select name="sel">
			<%
				for (String item : pro.getProductList()) {
					out.println("<option>" + item + "</option>");
				}
			%>
		</select>
		--%>
		
		<%-- 위 소스를 표현언어(EL)와 JSTL을 적용하여 코딩요! --%>
		<select name="sel">
			<c:forEach var="item" items="${pro.productList}">
				<option>${item}</option>
			</c:forEach>
		</select>
		
		<input type="submit" value="제품 선택" />
	</form>
</body>
</html>