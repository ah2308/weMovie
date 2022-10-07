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

import com.weMovies.dto.LoginDTO;
import com.weMovies.dto.MemberDTO;
import com.weMovies.dto.MovieDTO;
import com.weMovies.service.MemberService;
import com.weMovies.service.MovieService;

@Controller
public class MovieController {

    @Inject
    private MovieService movieService;
    // 예매 버튼을 누르면 폼 화면으로 이동시켜주는 역할
    @RequestMapping("ticket.do")
    public String goticketingPage() {
        return "ticket/ticket";
    }

    @RequestMapping("ticketing.do")
    public String ticketing(MovieDTO mdto) throws Exception {
        String name = movieService.ticketing(mdto);
        return name;
    }
}