package com.portfolio.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import com.portfolio.portfolio.controller.OptionsRequestInterceptor;


@SpringBootApplication
public class PortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}
	////////////////////////////////////////////////////////////////
	// CONFIGURACION CORS //////////////////////////////////////////
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
					//.exposedHeaders("Authorization")
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
	
	////////////////////////////////////////////////////////////////
	// OPTIONS REQUEST INTERCEPTOR /////////////////////////////////
	@Configuration
	public class WebMvcConfig implements WebMvcConfigurer {

		@Override
		public void addInterceptors(InterceptorRegistry registry) {
			registry.addInterceptor(new OptionsRequestInterceptor()).addPathPatterns("/**");
		}

	}
}
