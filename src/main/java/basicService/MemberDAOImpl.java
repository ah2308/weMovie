package basicService;

import org.apache.ibatis.session.SqlSession;

public class MemberDAOImpl implements MemberService {
	
	private SqlSession sqlSession;
	private String Mapper;
	
	public MemberDAOImpl(SqlSession sqlSession) {
		
	}
	
	public void register(Member member) {
		
	}
	
	public Member login(LoginDTO loginDTO) {
		return null;
	}
}
