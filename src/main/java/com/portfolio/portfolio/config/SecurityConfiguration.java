package com.portfolio.portfolio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import com.portfolio.portfolio.security.config.JwtAuthenticationFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.http.HttpMethod;


@Configuration
@EnableWebSecurity
@RequiredArgsConstructor

public class SecurityConfiguration {

  private final JwtAuthenticationFilter jwtAuthFilter;
  private final AuthenticationProvider authenticationProvider;
  private final LogoutHandler logoutHandler;

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
        .cors().and()
        .csrf().disable().httpBasic().and()
        .authorizeHttpRequests()
          .requestMatchers(HttpMethod.GET, "/api/get/**").permitAll()
          .requestMatchers("/api/auth/register").permitAll()
          .requestMatchers("/api/auth/authenticate").permitAll()
          .anyRequest().authenticated()
        .and()
        .sessionManagement()
        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        .and()

        .authenticationProvider(authenticationProvider)
        .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)

        .logout()
        .logoutUrl("/api/auth/logout")
        .addLogoutHandler(logoutHandler)
        .logoutSuccessHandler((request, response, authentication) -> SecurityContextHolder.clearContext())
        .and().httpBasic();
    ;

    return http.build();
  }
}
