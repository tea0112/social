package com.social.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.jdbc.DataSourceBuilder;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {
  @Bean
  public DataSource getDatasource() {
    DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
    dataSourceBuilder.driverClassName("org.postgresql.Driver");
    String url = "jdbc:postgresql://localhost:5432/social";
    dataSourceBuilder.url(url);
    dataSourceBuilder.username("social");
    dataSourceBuilder.password("Social!23");
    return dataSourceBuilder.build();
  }
}
