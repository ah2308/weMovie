package com.weMovies.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.weMovies.dto.MemberDTO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	SqlSession sqlSession;

	@Override
	public String login(MemberDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("member.login", dto);
	}

}
