package com.weMovies.service;

import com.weMovies.dao.MemberEntity;
import com.weMovies.dto.MemberVO;

public class MemberService {
	MemberEntity ce;
	
	public MemberService() {
		ce = new MemberEntity();	
	}
	
	public void doMember(MemberVO vo) {
		ce.doMember(vo);
	}
	
	public void doLogin(MemberVO vo) {
		ce.doLogin(vo);
	}
}
