package pl.carservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import pl.carservice.services.IssuesService;
import pl.carservice.services.WebIssuesService;

@Configuration
@ComponentScan("pl.carservice.controllers")
@EnableWebMvc
public class CarServiceWebConfiguration {

	@Bean
	public IssuesService issuesService() {
		return new WebIssuesService();
	}
}
