package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping
	public String home() {
		return "home";
	}
	
	@GetMapping("/buy")
	public String buySandWich() {
		return "buySandWich";
	}
	
	@PostMapping("/done")
	public ModelAndView doneBuy(@RequestParam("condiments") String[] condiments) {
		return new ModelAndView("done","option",condiments);
	}
}
