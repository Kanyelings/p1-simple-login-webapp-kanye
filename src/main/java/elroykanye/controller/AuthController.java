package elroykanye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import elroykanye.services.AuthService;

@Controller
public class AuthController {

	AuthService authService;
	
	public AuthController(AuthService as) {
		authService = as;
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public ModelAndView login(@RequestParam String username, @RequestParam String userpass) {
		ModelAndView mv = new ModelAndView();
		if (authService.login(username, userpass)) {
			mv.addObject("username", username);
			mv.setViewName("dashboard");
		} else {
			mv.addObject("message", "Failed Login");
			mv.setViewName("login");
		}
		return mv;
	}

	@RequestMapping(value="register", method = RequestMethod.POST)
	public ModelAndView register(@RequestParam String username, @RequestParam String userpass) {
		ModelAndView mv = new ModelAndView();
		// mv.addObject("message", authService.register(username, userpass) ? "Successful register" : "Unsuccessful register");
		if(authService.register(username, userpass)) {
			mv.addObject("message", "Successful register");
			mv.setViewName("index");
		} else {
			mv.addObject("message", "Unsuccessful register");
			mv.setViewName("register");
		}
		return mv;
	}
}
