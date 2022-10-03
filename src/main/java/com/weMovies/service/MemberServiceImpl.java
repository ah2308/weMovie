package com.weMovies.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.weMovies.dao.MemberDAO;
import com.weMovies.dto.MemberDTO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Inject
	MemberDAO dao;
	
	@Override
	public String login(MemberDTO dto) throws Exception {
		return dao.login(dto);
	}

}
