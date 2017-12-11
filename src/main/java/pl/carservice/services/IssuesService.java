package pl.carservice.services;

import java.util.List;

import pl.carservice.dto.Issue;

public interface IssuesService {
	String getIssue();
	List<Issue> listIssues();
}
