package com.portfolio.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class PortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {

				registry.addMapping("/api/get/**")
					//.allowedOrigins("http://localhost:4200")
					.allowedOrigins("*")
					.allowedMethods("GET")
					.allowedHeaders("*")
					.allowCredentials(false);

				registry.addMapping("/api/auth/**")
					//.allowedOrigins("http://localhost:4200")
					.allowedOrigins("*")
					.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
					.allowedHeaders("*")
					.exposedHeaders("Authorization")
					.allowCredentials(true)
					.maxAge(3600);

				registry.addMapping("/api/delete/**")
					//.allowedOrigins("http://localhost:4200")
					.allowedOrigins("*")
					.allowedMethods("DELETE")
					.allowedHeaders("*")
					.allowCredentials(false);

				registry.addMapping("/api/new/**")
					//.allowedOrigins("http://localhost:4200")
					.allowedOrigins("*")
					.allowedMethods("POST")
					.allowedHeaders("*")
					.allowCredentials(false);
			}
		};
	}
}
