package pl.carservice.controllers;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.carservice.services.IssuesService;

@Controller
@RequestMapping("/issue")
public class IssuesController {

	private IssuesService issuesService;

	@Autowired
	public IssuesController(IssuesService issuesService) {
		super();
		this.issuesService = issuesService;
	}

	@RequestMapping("/**")
	@ResponseBody
	public String test(Locale locale) {
		return locale.toString();
	}

	@RequestMapping("/issue/**")
	@ResponseBody
	public String testIssue() {
		return issuesService.getIssue();
	}
	
	@RequestMapping("/issue/*/test")
	@ResponseBody
	public String testIssue2() {
		return "Mapowanie /issue/*/test";
	}
}
