package com.example.springcloudgatewayforwardroutingbug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudGatewayForwardRoutingBugApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGatewayForwardRoutingBugApplication.class, args);
	}

	@Bean
	RouterFunction<ServerResponse> staticResourceRouter()
	{
		return RouterFunctions.resources("/**", new ClassPathResource("static/"));
	}

}
