package pl.carservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IssuesController {
	
	@RequestMapping("/**")
	@ResponseBody
	public String test() {
		return "Hello";
	}
}
