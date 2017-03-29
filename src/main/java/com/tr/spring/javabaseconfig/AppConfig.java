package com.tr.spring.javabaseconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.tr.spring.scope.AdvanceAction;
import com.tr.spring.scope.AnotherAction;

@Configuration
public class AppConfig {
	@Bean
	@Scope("singleton")
	public AdvanceAction advanceAction() {
		return new AdvanceAction();
	}

	@Bean
	@Scope("prototype")
	public AnotherAction anotherAction() {
		return new AnotherAction();
	}
}

