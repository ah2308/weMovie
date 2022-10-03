package com.weMovies.service;

import com.weMovies.dto.MemberDTO;

public interface MemberService {
	public String login(MemberDTO dto) throws Exception;
}
