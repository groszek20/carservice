package pl.carservice.controllers;

import java.util.Locale;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		return "Mapowanie /**";
	}
	
//	@RequestMapping(path = "/issue/{idIssue}/{test}", method = RequestMethod.GET)
//	@ResponseBody
//	public String testIssue(@PathVariable("idIssue") String idIssue, @PathVariable("test") String test) {
//		return "mapowanie GET, zmienna = " + idIssue + test;
//	}
	
//	@RequestMapping(path = {"/issue/{idIssue}/{test}","/issue/{idIssue}/"}, method = RequestMethod.GET)
//	@ResponseBody
//	public String testIssue(@PathVariable Map<String, String> args) {
//		return "mapowanie GET, zmienna = " + args;
//	}

	@RequestMapping(path = {"/issue/{idIssue}/{test}","/issue/{idIssue}/"}, method = RequestMethod.GET)
	@ResponseBody
	public String testIssue(@PathVariable("idIssue") String idIssue, @PathVariable("test") Optional<String> optional) {
		return "mapowanie GET, zmienna = " + idIssue + optional.orElse("pusto");
	}
	
	@RequestMapping(path = "/issue/**", method = RequestMethod.GET, headers="Myheader=x")
	@ResponseBody
	public String testIssue3() {
		return "mapowanie GET Myheader=x";
	}
	
	@RequestMapping(path = "/issue/**", method = RequestMethod.POST)
	@ResponseBody
	public String testIssue2() {
		return "mapowanie POST";
	}
}
