package com.tr.spring.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
/*
 * this ApplicationContext is for  development
 */
public class DevDatabaseConfig {
	@Bean
	public DataSource dataSource(){
		System.out.println("This is develop datasource");
		return null;
	}
}

