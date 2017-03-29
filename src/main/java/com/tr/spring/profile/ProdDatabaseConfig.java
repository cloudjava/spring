package com.tr.spring.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
/*
 * this ApplicationContext is for  production
 */
public class ProdDatabaseConfig {
	@Bean
	public DataSource dataSource(){
		System.out.println("This is production datasource");
		return null;
	}
}

