package pl.coderslab.controller;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String indexAction() {
		return "index";
	}
	
//	@RequestMapping("/")
//	public String timer() {
//		LocalDateTime now = LocalDateTime.now();
//		System.out.println(now);
//		
//		if (LocalDateTime.now().getDayOfWeek() == DayOfWeek.SUNDAY|| LocalDateTime.now().getDayOfWeek() == DayOfWeek.SATURDAY) {
//			return "indexClosed";
//		}
//		if (LocalDateTime.now().getHour() > 9 && LocalDateTime.now().getHour() < 17) {
//			return "index";
//		}else if (LocalDateTime.now().getHour() < 9 && LocalDateTime.now().getHour() > 17) {
//			return "indexClosed";
//		}
//	   
//		
//	}
		
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
