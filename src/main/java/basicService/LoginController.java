package basicService;

import javax.servlet.http.HttpSession;

public class LoginController implements MemberService {

	private MemberService memberservice;

	public LoginController(MemberService memberService) {

	}

	public String loginGet(LoginDTO loginDTO) {
		return null;
	}
	
	public loginPost(LoginDTO loginDTO, HttpSession httpSession, Model model) {
	
	}
}
