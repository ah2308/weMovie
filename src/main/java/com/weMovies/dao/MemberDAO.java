package com.weMovies.dao;

import com.weMovies.dto.MemberDTO;

public interface MemberDAO {
	public String loginCheck(MemberDTO dto);
}