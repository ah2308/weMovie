package basicService;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public class MemberController implements MemberService {

	private MemberService memberService;

	public String registerGet() {
		return null;
	}

	public String registerPost(Member member, RedirectAttributes redirectAttributes) {
		return null;
	}
}
