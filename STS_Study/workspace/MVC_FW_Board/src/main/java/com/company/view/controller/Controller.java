package com.company.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	/*
	 * 
	 * 구체적인 Controller 클래스들을 구현하기에 앞서
	 * 모든 Controller를 같은 타입으로 관리하기 위한 인터페이스를 만들어야 한다.
	 * 
	 */
	// 추상 메소드
	String handleRequest(HttpServletRequest request, HttpServletResponse response);
}
