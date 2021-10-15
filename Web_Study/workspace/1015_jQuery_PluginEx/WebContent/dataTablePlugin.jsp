<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dataTable 플러그인 활용하기</title>
<link rel="stylesheet" href="media/css/demo_table_jui.css">
<link rel="stylesheet" href="media/css/demo_page.css">
<link rel="stylesheet" href="media/css/demo_table.css">

<!-- 코딩 순서가 중요 -->
<!-- jQuery 인클루드 -->
<script src="js/jquery.js"></script>

<!-- jQuery 플러그인 인클루드 -->
<script src="media/js/jquery.dataTables.js"></script>

<!-- jQuery 적용 -->
<script>
	$(function(){
		$("#example").dataTable();
	});
</script>
</head>
<body>
	<table class="display" id="example">
		<thead>
			<tr>
				<th>번호</th>
				<th>과일명</th>
				<th>가격</th>
				<th>설명</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>1</td>
				<td>레몬</td>
				<td align="right">3000</td>
				<td>레몬에 포함되어 있는 쿠엔산은 피로회복에 좋다.</td>
			</tr>
			<tr>
				<td>2</td>
				<td>키위</td>
				<td align="right">2000</td>
				<td>비타민C가 풍부하다. 다이어트에 매우 좋다.</td>
			</tr>
			<tr>
				<td>3</td>
				<td>블루베리</td>
				<td align="right">5000</td>
				<td>블루베리에 포함된 안토시아닌은 눈피로에 효과가 있다.</td>
			</tr>
			<tr>
				<td>4</td>
				<td>체리</td>
				<td align="right">5000</td>
				<td>체리는 맛이 단 성분이 많고 피로회복에 잘 듣는다.</td>
			</tr>
			<tr>
				<td>5</td>
				<td>메론</td>
				<td align="right">5000</td>
				<td>메론에는 비타민 A와 칼륨이 많이 포함됨.</td>
			</tr>
			<tr>
				<td>6</td>
				<td>수박</td>
				<td align="right">15000</td>
				<td>수분이 풍부한 과일이다.</td>
			</tr>
			<tr>
				<td>7</td>
				<td>오렌지</td>
				<td align="right">15000</td>
				<td>비타민C가 풍부하다.</td>
			</tr>
			<tr>
				<td>8</td>
				<td>파란사과</td>
				<td align="right">4000</td>
				<td>단맛이 강한 향기가 상큼한 파란사과.</td>
			</tr>
			<tr>
				<td>9</td>
				<td>파인애플</td>
				<td align="right">3000</td>
				<td>비타민B1 비타민B2가 풍부하다.</td>
			</tr>
			<tr>
				<td>10</td>
				<td>포도</td>
				<td align="right">3500</td>
				<td>피로회복,피부미용, 펙닌은 장 운동을 촉진시킨다.</td>
			</tr>
			<tr>
				<td>11</td>
				<td>석류</td>
				<td align="right">4500</td>
				<td>피부는 물론 다이어트 과일.</td>
			</tr>
			<tr>
				<td>12</td>
				<td>토마토</td>
				<td align="right">3000</td>
				<td>암과 노화를 막아주는 과일.</td>
			</tr>
			<tr>
				<td>13</td>
				<td>참외</td>
				<td align="right">4000</td>
				<td>칼륨 함량이 높아 이뇨 작용에 탁월하다.</td>
			</tr>
		</tbody>
		<tfoot align="center">
			<tr>
				<td colspan="4"><b>2020년 05월 15일 작성</b></td>
			</tr>
		</tfoot>
	</table>
</body>
</html>