package com.weMovies.service;

import javax.servlet.http.HttpSession;

import com.weMovies.dto.MemberDTO;

public interface MemberService {
	public String login(MemberDTO dto) throws Exception;
	public void logout(HttpSession session);
}
