<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바스크립트 jQuery change() 함수 쇼핑몰에 적용예제</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>

<script>
	function hideOption() {
		$('#select2, #select3').hide();
		itemChange(); //함수 호출
	}
	
	function itemChange() {
		$('select[name=option1]').change(function(){
			$('#select2').show();
		});
		
		$('select[name=option2]').change(function(){
			$('#select3').show();
		});
	}
</script>
</head>
<body onload="hideOption();">
	<form name="shoppingForm">
		<h1>롯데 백화점 쇼핑</h1>
		<b>와이셔츠 상품 구매 시 옵션 선택</b>
		<br><br>
		<select id="select1" name="option1">
			<option selected>상품명 선택</option>
			<option value="링클프리 셔츠">링클프리 셔츠</option>
			<option value="라인NB 셔츠">라인NB 셔츠</option>
			<option value="이중ST포켓 셔츠">이중ST포켓 셔츠</option>
			<option value="더블카우스 셔츠">더블카우스 셔츠</option>
			<option value="사선 배색 셔츠">사선 배색 셔츠</option>
		</select>
		<br><br>
		
		<select id="select2" name="option2">
			<option selected>색상 선택</option>
			<option value="White">White</option>
			<option value="Black">Black</option>
			<option value="Dark red">Dark red</option>
			<option value="Maroon">Maroon</option>
			<option value="Darkcyan">Darkcyan</option>		
		</select>
		<br><br>
		
		<select id="select3" name="option3">
			<option selected>사이즈 선택</option>
			<option value="L">L|50,000|10개 남음</option>
			<option value="M">M|60,000|8개 남음</option>
			<option value="XL">XL|80,000|5개 남음</option>
		</select>
	</form>
</body>
</html>