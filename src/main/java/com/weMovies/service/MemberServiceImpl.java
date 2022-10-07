package com.weMovies.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

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
	
	@Override
	public void logout(HttpSession session) {
	 session.invalidate(); // 세션 초기화
	}

    @Override
    public void register(MemberDTO dto) throws Exception{
        dao.register(dto);
    }

    @Override
    public int idChk(String mid) throws Exception {
        int result = dao.idChk(mid);
        return result;
    }
}
