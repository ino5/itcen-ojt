package com.company.view.controller;

public class ViewResolver {
	// 필드 선언
	public String prefix;	// 접두사 => "./" 초기화
	public String suffix;	// 접미사 => ".jsp" 초기화
	
	// setter 메소드만 필요
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
	// 사용자 정의 메소드
	/*
	 * (예) 포워딩할 때 => "./getBoardList.jsp"
	 * 						./    => 접두사 setPrefix("./");
	 * 						.jsp  => 접미사 setSuffix(".jsp");
	 */
	public String getView(String viewName) {
		return prefix + viewName +suffix;
	}
}
