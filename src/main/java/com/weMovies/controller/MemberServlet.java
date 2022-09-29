package com.weMovies.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.weMovies.service.MemberService;
import com.weMovies.dto.MemberVO;

@WebServlet("/member.do")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	MemberService cs;
	HttpSession httpSession;
	
    public MemberServlet() {
        super();
        cs = new MemberService();
    }

    protected void requestProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String choice = (String)request.getParameter("choice");
    	
    	if(choice.equals("insertMember")) {
    		insertMember(request, response);
    	} else if(choice.equals("login")) {
    		login(request, response);
    	} else if(choice.equals("logout")) {
    		logout(request, response);
    	} 
		
    }
    
	protected void insertMember(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = (String)request.getParameter("id");
		String pwd = (String)request.getParameter("pwd");
		String name = (String)request.getParameter("name");
		String age = (String)request.getParameter("age");
		String phone = (String)request.getParameter("phone");
		
		MemberVO vo = new MemberVO(id, pwd, name, age, phone);
		cs.doMember(vo);
		
		RequestDispatcher view = request.getRequestDispatcher("resultMember.jsp");
		request.setAttribute("vo", vo);
		view.forward(request, response);		
	}
	
	protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = (String)request.getParameter("id");
		String pwd = (String)request.getParameter("pwd");		
		
		MemberVO vo = new MemberVO(id, pwd);
		cs.doLogin(vo);
		
		if(vo.getName() != null) {
			httpSession = request.getSession(true);
			httpSession.setAttribute("vo", vo);
		} else {
			RequestDispatcher view = request.getRequestDispatcher("fail.jsp");
			view.forward(request, response);		
		}
		
		RequestDispatcher view = request.getRequestDispatcher("login_ok.jsp");
		view.forward(request, response);		
	}
	
	protected void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		httpSession.invalidate();
		
		RequestDispatcher view = request.getRequestDispatcher("logout_ok.jsp");
		view.forward(request, response);		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requestProcess(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		requestProcess(request, response);
	}

}
