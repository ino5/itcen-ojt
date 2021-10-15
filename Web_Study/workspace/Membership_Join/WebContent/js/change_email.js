/*
 * change_email.js 파일: 이메일 도메인 '직접입력' 처리
 */

function change_email() {
	var email_add = document.getElementById("email_add");
	var email_sel = document.getElementById("email_sel");
	
	// 사용자가 선택한 옵션의 순서와 값 구하기
	var idx = email_sel.options.selectedIndex;
	var val = email_sel.options[idx].value;
	
	email_add.value = val;
}