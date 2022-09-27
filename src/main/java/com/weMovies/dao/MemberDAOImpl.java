package com.weMovies.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.weMovies.dto.MemberDTO;

@Repository // 현재 클래스 dao bean 등록
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	SqlSession sqlSession; // SQLSession 의존관계 주입

	@Override
	public String loginCheck(MemberDTO dto) {
		return sqlSession.selectOne("member.login_check", dto);
	}

}
