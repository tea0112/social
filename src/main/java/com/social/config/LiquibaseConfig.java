package com.social.config;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class LiquibaseConfig {
  @Autowired
  private DataSource dataSource;

  @Bean
  public SpringLiquibase getLiquibase() {
    SpringLiquibase liquibase = new SpringLiquibase();
    liquibase.setChangeLog("classpath:db/changelog/changelog-master.xml");
    liquibase.setDataSource(dataSource);
    liquibase.setDropFirst(true);

//    liquibase.setShouldRun(false);
    return liquibase;
  }
}
