package example.Spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showHomePage(Model model) {
		return "home";
	}
	
	@RequestMapping("/admin")
	public String showAdmin() {
		return "admin";
	}
	
	
}
