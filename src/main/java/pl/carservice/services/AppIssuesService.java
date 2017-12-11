package pl.carservice.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import pl.carservice.dto.Issue;

public class AppIssuesService implements IssuesService {

	private List<Issue>issues;
	
	public AppIssuesService() {
		super();
		issues = new ArrayList<Issue>();
		issues.add(new Issue("Tytu³ pierwszego zg³oszenia", "treœæ pierwszego zg³oszenia", 1, new Date()));
		issues.add(new Issue("Tytu³ drugiego zg³oszenia", "treœæ drugiego zg³oszenia", 2, new Date()));
		issues.add(new Issue("Tytu³ trzeciego zg³oszenia", "treœæ trzeciego zg³oszenia", 3, new Date()));
		issues.add(new Issue("Tytu³ czwartego zg³oszenia", "treœæ czwartego zg³oszenia", 4, new Date()));
	}

	public String getIssue() {
		return "Issue from app";
	}

	@Override
	public List<Issue> listIssues() {
		return Collections.unmodifiableList(issues);
	}

}
