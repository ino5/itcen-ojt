package com.company.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.annotation.user.UserDAO;
import com.company.annotation.user.UserDO;

@Controller
public class LogoutController{
	@RequestMapping("/logout.do")
	public String logout(UserDO userDO, UserDAO userDAO, HttpSession session) {
		session.invalidate();
		System.out.println("로그아웃 성공");
		
		return "login.jsp";
		
	}
}