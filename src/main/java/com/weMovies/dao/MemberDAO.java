package com.weMovies.dao;

import com.weMovies.dto.MemberDTO;

//요기에 @Primary 있었음
public interface MemberDAO {
    //로그인
	public String login(MemberDTO dto)throws Exception;
	//로그아웃
	public void register(MemberDTO dto) throws Exception;
}
