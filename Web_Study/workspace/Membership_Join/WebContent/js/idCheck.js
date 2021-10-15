/*
 * idCheck.js 파일 => 아이디 중복 체크 자바스크립트 파일 
 */

function idCheck(id) {
	if (id == "") {
		alert('아이디를 입력해 주세요!!');
	} else { //아이디 값이 넘어온 경우
		url = "IdCheck.jsp?mem_id=" + id; // 페이지 이동 시 get 방식으로 데이터를 넘긴다.
		window.open(url, "get", "width=350, height=150");
	}
}
