package com.portfolio.portfolio.security.config;

import com.portfolio.portfolio.security.user.UserRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {

  private final UserRepository repository;

  @Bean
  public UserDetailsService userDetailsService() {
    return username -> repository.findByEmail(username)
        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
  }

  @Bean
  public AuthenticationProvider authenticationProvider() {
    DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
    authProvider.setUserDetailsService(userDetailsService());
    authProvider.setPasswordEncoder(passwordEncoder());
    return authProvider;
  }

  @Bean
  public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
    return config.getAuthenticationManager();
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  //PARA PETICIONES OPTIONS
  @Bean
  public DispatcherServletBeanPostProcessor dispatcherServletBeanPostProcessor() {
      return new DispatcherServletBeanPostProcessor();
  }

  public static class DispatcherServletBeanPostProcessor implements BeanPostProcessor {
    
      @Override
      public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
          if (bean instanceof DispatcherServlet) {
              ((DispatcherServlet) bean).setDispatchOptionsRequest(true);
          }
          return bean;
      }

      @Override
      public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
          return bean;
      }
  }

}
