package com.company.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.annotation.user.UserDAO;
import com.company.annotation.user.UserDO;

@Controller
public class LoginController {	// Controller 클래스는 POJO 클래스로 구현한다!!
	
	/*
	 * @RequestMapping 어노테이션은 요청 URL을 어떤 메소드가 처리할지 여부를 결정한다.
	 */
	@RequestMapping("/login.do")
	public String login(UserDO userDO, UserDAO userDAO, HttpSession session) {
		UserDO user = userDAO.getUser(userDO);
		
		if (user != null) {
			session.setAttribute("userName", user.getName());
			System.out.println("로그인 성공");
			return "getBoardList.do";
		} else {
			System.out.println("로그인 실패");
			return "login.jsp";
		}
	}

}
