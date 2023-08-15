package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class EmailController {
	@GetMapping
	public String home() {
		return "home";
	}
	
	@PostMapping("/check")
	public ModelAndView checkEmail(@RequestParam("email") String email) {
		String patternEmail = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$";
		if(email.matches(patternEmail)) {
			String text = email+" Đã đúng định dạng";
			return new ModelAndView("result","kq",text);
		}
		String text = email+" Không đúng định dạng";
		return new ModelAndView("result","kq",text);
	}
	
}
