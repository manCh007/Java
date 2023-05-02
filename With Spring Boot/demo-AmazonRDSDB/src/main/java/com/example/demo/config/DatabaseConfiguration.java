package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
public class DatabaseConfiguration {
	
	@Bean(name = "rdsDataSource")
	@ConfigurationProperties(prefix = "spring.rds.datasource")
	public DataSource datasource() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean(name = "rdsJdbcTemplate")
	public NamedParameterJdbcTemplate jdbcTemplate(@Qualifier(value = "rdsDataSource") DataSource dataSource) {
		return new NamedParameterJdbcTemplate(dataSource);
	}

}
