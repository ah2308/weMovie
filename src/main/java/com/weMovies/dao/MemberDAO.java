package com.weMovies.dao;

import com.weMovies.dto.MemberDTO;

//요기에 @Primary 있었음
public interface MemberDAO {
	public String login(MemberDTO dto)throws Exception;
}
