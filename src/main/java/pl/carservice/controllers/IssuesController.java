package pl.carservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.carservice.services.IssuesService;

@Controller
public class IssuesController {
	
	private IssuesService issuesService;
	
	@Autowired
	public IssuesController(IssuesService issuesService) {
		super();
		this.issuesService = issuesService;
	}
	
	@RequestMapping("/**")
	@ResponseBody
	public String test() {
		return issuesService.getIssue();
	}
}
