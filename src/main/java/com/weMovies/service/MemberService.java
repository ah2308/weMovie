package com.weMovies.service;

import javax.servlet.http.HttpSession;

import com.weMovies.dto.MemberDTO;

public interface MemberService {
    //로그인
	public String login(MemberDTO dto) throws Exception;
	//로그아웃
	public void logout(HttpSession session);
	//회원가입
	public void register(MemberDTO dto) throws Exception;
	//ID 중복체크
	public int idChk(String mid) throws Exception;
}
