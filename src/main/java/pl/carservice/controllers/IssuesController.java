package pl.carservice.controllers;

import java.util.Locale;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.carservice.dto.RecordRange;
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

	@RequestMapping("/")
	public String test(@RequestParam("range") RecordRange range, Model model) {
		model.addAttribute("issues", issuesService.listIssues().subList(range.getFrom(), range.getTo()));
		return "issuesList";
	}
	

	@RequestMapping(path = {"/issue/{idIssue}/{test}","/issue/{idIssue}/"}, method = RequestMethod.GET)
	@ResponseBody
	public String testIssue(@PathVariable("idIssue") String idIssue, @PathVariable("test") Optional<String> optional) {
		return "mapowanie GET, zmienna = " + idIssue + optional.orElse("pusto");
	}
	
}
