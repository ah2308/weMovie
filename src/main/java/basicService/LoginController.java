package basicService;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

public class LoginController implements MemberService {

	private MemberService memberservice;

	public LoginController(MemberService memberService) {

	}

	public String loginGet(LoginDTO loginDTO) {
		return null;
	}
	
	//임시 void
	public void loginPost(LoginDTO loginDTO, HttpSession httpSession, Model model) {
	
	}
}
