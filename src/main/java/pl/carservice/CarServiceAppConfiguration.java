package pl.carservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.carservice.services.AppIssuesService;
import pl.carservice.services.IssuesService;

@Configuration
public class CarServiceAppConfiguration {

	@Bean
	public IssuesService issuesService() {
		return new AppIssuesService();
	}
}
