package com.weMovies.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.weMovies.dto.MemberDTO;
import com.weMovies.service.MemberService;


@Controller
public class MemberController {

    private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
    @Inject
    private MemberService service;

    // 메인화면으로 보내줄 맵핑
    @RequestMapping("index")
    public String menu() {
        return "index";
    }

    // 로그인 버튼을 누르면 폼 화면으로 이동시켜주는 역할
    @RequestMapping(value = "/login.do", method = RequestMethod.GET)
    public String goLoginPage() {
        return "member/loginForm";
    }

    @RequestMapping("login_check.do")
    public ModelAndView login(MemberDTO dto, HttpSession session, ModelAndView mav) throws Exception {
        String name = service.login(dto);
        if (name != null) {
            session.setAttribute("mid", dto.getMid());
            session.setAttribute("name", dto.getName());
            mav.setViewName("index");
        } else {
            mav.setViewName("member/loginForm");
        }
        return mav;
    }

    /*
     * // 로그인 화면에서 세션 처리를 할 부분
     * 
     * @RequestMapping("login_check.do")
     * public String login(LoginDTO ldto, HttpSession session, Model model) throws
     * Exception {
     * String name = service.login(ldto);
     * if (name != null) {
     * session.setAttribute("mid", ldto.getMid());
     * // session.setAttribute("name", ldto.getName());
     * model.addAttribute("msg", "로그인에 성공하셨습니다.");
     * model.addAttribute("url", "");
     * } else {
     * model.addAttribute("msg", "로그인에 실패하셨습니다. 다시 시도해주세요.");
     * model.addAttribute("url", "/login.do");
     * }
     * return "alert/message";
     * }
     */

    // 로그인 상태에서 세션값 초기화. 로그아웃
    @RequestMapping("logout.do")
    public String logout(HttpSession session, Model model) throws Exception {
        service.logout(session);
        // mav.setViewName("redirect:/");
        model.addAttribute("msg", "성공적으로 로그아웃 하였습니다.");
        model.addAttribute("url", "index");
        return "alert/message";
    }

    // 회원가입 버튼을 누르면 폼 화면으로 이동시켜주는 역할
    @RequestMapping("registForm")
    public String goregistPage() {
        return "member/registForm";
    }

    // id 중복체크
    @ResponseBody
    @RequestMapping("idChk")
    public int idChk(@RequestParam("mid")String mid) throws Exception {
        int result = service.idChk(mid);
        System.out.println(result);
        return result;
    }

    // 회원가입이 성공적으로 이루어지면 이동시켜준다
    @RequestMapping("register.do")
    public String register(MemberDTO dto, Model model, String mid) throws Exception {
        logger.info("post register");
        int result = service.idChk(mid);
        try {
            // 회원가입 실패시 msg, url을 설정합니다.
            if (result == 1) {
                model.addAttribute("msg", "회원가입에 실패하였습니다.");
                model.addAttribute("url", "/registForm");
                //return "/member/registForm";
            } else if (result == 0) {
                // 회원가입 성공시 msg, url을 설정합니다.
                service.register(dto);
                model.addAttribute("msg", "회원가입이 완료되었습니다.");
                model.addAttribute("url", "loginForm");
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        // alert 스크립트가 있는 regist_message로 값을 전달하고, 화면에 alert창을 띄우는 역할입니다.
        return "alert/message";
    }
}