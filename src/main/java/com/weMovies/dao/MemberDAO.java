package com.weMovies.dao;

import com.weMovies.dto.LoginDTO;
import com.weMovies.dto.MemberDTO;

//요기에 @Primary 있었음
public interface MemberDAO {
    //로그인
	public String login(MemberDTO dto)throws Exception;
	//회원가입
	public void register(MemberDTO dto) throws Exception;
	//ID 중복체크
	public int idChk(String mid) throws Exception;
}
