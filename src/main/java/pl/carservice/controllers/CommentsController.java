package pl.carservice.controllers;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.carservice.services.IssuesService;

@Controller
@RequestMapping("/comments/**")
public class CommentsController {
	
	private IssuesService issuesService;
	
	@Autowired
	public CommentsController(IssuesService issuesService) {
		super();
		this.issuesService = issuesService;
	}
	
	@RequestMapping("/**")
	@ResponseBody
	public String test() {
		return "comment";
	}
}
