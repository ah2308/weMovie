package ctr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/index")
	public String main() {
		System.out.println("MainController: 메인 화면으로 이동");
		return "index";
	}
	@RequestMapping("/login")
	public String login() {
		System.out.println("MainController: 로그인 화면으로 이동");
		return "login";
	}
	@RequestMapping("/regist")
	public String regist() {
		System.out.println("MainController: 회원가입 화면으로 이동");
		return "regist";
	}
}
