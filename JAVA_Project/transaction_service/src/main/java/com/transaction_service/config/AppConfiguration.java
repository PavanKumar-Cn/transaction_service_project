package com.transaction_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfiguration {

	@Bean
	WebMvcConfigurer configurer() {
		return new WebMvcConfigurer() {

			public void addCorsMapping(CorsRegistry corsRegistry) {
				System.out.println("hekko");
				corsRegistry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST", "PUT", "DELETE")
						.allowedHeaders("**").maxAge(3600);
			}

		};
	}

}
