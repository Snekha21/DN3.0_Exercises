package com.example.EmployeeManagementSystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.AuditorAware;

@Configuration
public class AuditingConfig {
	
	  @Bean
	  @Primary

	    public AuditorAware<String> auditorProvider() {
	        return new AuditorAwareImpl();
	    }
}
