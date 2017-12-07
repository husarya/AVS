package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String indexAction() {
		return "index";
	}
	
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	@RequestMapping("/login")
	public String loginTest() {
		return "login";
	}
	@RequestMapping("/user")
	public String user() {
		return "user";
	}
	

}
