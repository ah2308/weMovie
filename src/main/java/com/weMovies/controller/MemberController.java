package com.weMovies.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.weMovies.dao.MemberDAO;
import com.weMovies.dto.MemberDTO;
import com.weMovies.service.MemberService;

@Controller
public class MemberController {
    
    @Inject
    private SqlSession sqlSession;

	@Inject
	private MemberService service;
	
	//로그인 버튼을 누르면 폼 화면으로 이동시켜주는 역할
	@RequestMapping("member/login")
	public String goLoginPage() {
		return "member/login";
	}
	
	//로그인 화면에서 세션 처리를 할 부분
	@RequestMapping("member/login_check.do")
	public ModelAndView login(MemberDTO dto, HttpSession session, ModelAndView mav) throws Exception {
		String name = service.login(dto);
		if(name != null) {
			session.setAttribute("mid", dto.getMid());
			session.setAttribute("name", dto.getName());
			mav.setViewName("redirect:/");
		}else {
			mav.setViewName("member/login");
		}
		return mav;
	}
	
	//로그인이 완료되었을때 주소를 반환하는데, 이 때 주소를 처리할 컨트롤러.
	@RequestMapping("member/menu")
	public String menu() {
		return "member/menu";
	}
	//로그인 상태에서 세션값 초기화. 로그아웃
	@RequestMapping("member/logout.do")
	public ModelAndView logout(HttpSession session, ModelAndView mav)throws Exception{
	    service.logout(session); 
	    mav.setViewName("redirect:/"); 
	    mav.addObject("message", "logout"); 
	    return mav;
    }
	/* 임시 로그아웃 기능 @RequestMapping("member/logout") public String logout(HttpSession session) { session.invalidate(); return "redirect:/";} */
	
	@RequestMapping("member/register")
	public String regist(MemberDTO dto) throws Exception {
	    sqlSession.insert("member.register", dto);
	    return "member/register";
	}
}