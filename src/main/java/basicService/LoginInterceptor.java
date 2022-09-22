package basicService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor {
	
	private String Login;
	private Loqqer loqqer;
	
	public void PostHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
		
	}
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		
	}
}
