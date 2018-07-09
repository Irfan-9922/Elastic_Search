package org.dss;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = { "org.dss" })
public class PersistenceContext {
	  @Bean(destroyMethod = "close")
	DataSource datasource(Environment env) {
		
		HikariConfig dataSourceConfig = new HikariConfig();
		
		dataSourceConfig.setDriverClassName(env.getRequiredProperty("db.driver"));
		dataSourceConfig.setJdbcUrl(env.getRequiredProperty("db.url"));
		dataSourceConfig.setUsername(env.getRequiredProperty("db.username"));
		dataSourceConfig.setPassword(env.getRequiredProperty("db.password"));
		return new HikariDataSource(dataSourceConfig);
         
		
	}
	  @Bean
	 	LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource, Environment env) {
	 		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
	 		// configure the data source
	 		entityManagerFactoryBean.setDataSource(dataSource);
	 		entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
	 		entityManagerFactoryBean.setPackagesToScan("org.dss");

	 		Properties jpaProperties = new Properties();
	 		// loads the property from the file
	 		jpaProperties.put("hibernate.dialect", env.getRequiredProperty("hibernate.dialect"));
	 		jpaProperties.put("hibernate.hbm2ddl.auto", env.getRequiredProperty("hibernate.hbm2ddl.auto"));
	 		jpaProperties.put("hibernate.ejb.naming_strategy", env.getRequiredProperty("hibernate.ejb.naming_strategy"));
	 		jpaProperties.put("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));
	 		jpaProperties.put("hibernate.format_sql", env.getRequiredProperty("hibernate.format_sql"));

	 		entityManagerFactoryBean.setJpaProperties(jpaProperties);
	 		return entityManagerFactoryBean;
	 	}
	  /* JPA Transaction manager */
		@Bean
		JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
			JpaTransactionManager transactionManager = new JpaTransactionManager();
			transactionManager.setEntityManagerFactory(entityManagerFactory);
			return transactionManager;
		}

}
