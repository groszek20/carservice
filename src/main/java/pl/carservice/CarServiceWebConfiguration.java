package pl.carservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pl.carservice.services.IssuesService;
import pl.carservice.services.WebIssuesService;

@Configuration
@ComponentScan("pl.carservice.controllers")
public class CarServiceWebConfiguration {

	@Bean
	public IssuesService issuesService() {
		return new WebIssuesService();
	}
}
