package pl.carservice.controllers;

import java.util.Locale;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

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
	public String testParam(@RequestParam(name="pageNumber", required=false) String pageNumber, 
			@RequestParam(name="recordCount", required=false) String recordCount,
			@CookieValue(name="recordCount", required=false, defaultValue="10") String recordCountCookie,
			@RequestHeader("User-Agent") String userAgent,
			@SessionAttribute("login") String login,
			HttpServletResponse response) {	
		String recCount = null;
		if(recordCount!=null) {
			response.addCookie(new Cookie("recordCount", recordCount));
			recCount = "Ustawiam recordCount na " + recordCount;
		}else {
			recCount = "Odczytana z ciasteczka " + recordCountCookie;
		}
		recCount +=" login " + login; 
		return recCount;
	}
	
	@RequestMapping(value = "/add", method=RequestMethod.POST)
	@ResponseBody
	public String addComment(@RequestBody MultiValueMap<String, String> body) {
		return body.toString();
	}
}
