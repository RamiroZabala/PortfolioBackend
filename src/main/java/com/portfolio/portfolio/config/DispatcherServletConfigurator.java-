package com.portfolio.portfolio.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;



@Configuration

public class DispatcherServletConfigurator {
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
