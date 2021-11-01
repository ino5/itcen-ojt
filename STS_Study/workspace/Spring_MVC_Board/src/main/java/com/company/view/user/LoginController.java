package com.company.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.company.Spring_MVC_Board.user.UserDAO;
import com.company.Spring_MVC_Board.user.UserDO;

public class LoginController implements Controller{

	@Override	// 재정의
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("로그인 처리");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		UserDO userDO = new UserDO();
		userDO.setId(id);
		userDO.setPassword(password);
		
		UserDAO userDAO = new UserDAO();
		UserDO user = userDAO.getUser(userDO);
		
		// ModelAndView 객체 생성 
		ModelAndView mav = new ModelAndView();
		
		if (user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("IdKey", id);
			
			// System.out.println("로그인 인증 성공");
			// 포워딩
			mav.setViewName("redirect:getBoardList.do");
		} else {
			// System.out.println("로그인 인증 실패");
			mav.setViewName("redirect:login.jsp");
		}
		
		return mav;
	}

}
