package com.weMovies.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.weMovies.dto.LoginDTO;
import com.weMovies.dto.MemberDTO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	SqlSession sqlSession;

	@Override
	public String login(MemberDTO dto) throws Exception {
		return sqlSession.selectOne("member.login", dto);
	}

    @Override
    public void register(MemberDTO dto) throws Exception {
        sqlSession.insert("insertMember.register", dto);
    }

    @Override
    public int idChk(String mid) throws Exception {
        int result = sqlSession.selectOne("insertMember.idChk", mid);
        return result;
    }

}
