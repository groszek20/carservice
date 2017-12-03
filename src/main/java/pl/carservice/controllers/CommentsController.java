package pl.carservice.controllers;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping("/{name:[a-z]+}{idComments:\\d+}")
	@ResponseBody
	public String test(@PathVariable("name") String name, @PathVariable("idComments") String id) {
		return "comment " + "name:" + name + " id:" + id;
	}
	
	@RequestMapping("/")
	@ResponseBody
	public String testParam(@RequestParam(name="pageNumber", required=false) String pageNumber) {
		return "wartosc " + pageNumber;
	}
	
	
}
