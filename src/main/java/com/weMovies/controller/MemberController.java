package com.weMovies.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.weMovies.dto.MemberDTO;
import com.weMovies.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;

	// menu.do 클릭 -> view/member/login.jsp
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("login_check.do")
	public ModelAndView login_check(@ModelAttribute MemberDTO dto, HttpSession session) {
		String name = memberService.loginCheck(dto, session);
		ModelAndView mav = new ModelAndView();
		if (name != null) { // 로그인 성공 시
			mav.setViewName("home"); // 뷰의 이름
		} else { // 로그인 실패 시
			mav.setViewName("login");
			mav.addObject("message", "error");
		}
		return mav;
	}

	@RequestMapping("logout.do")
	public ModelAndView logout(HttpSession session, ModelAndView mav) {
		memberService.logout(session);
		mav.setViewName("member/login");
		mav.addObject("message", "logout");
		return mav;
	}
}