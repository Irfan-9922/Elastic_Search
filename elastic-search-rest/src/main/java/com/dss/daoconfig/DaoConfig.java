package com.dss.daoconfig;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

/**
 * @author s.parmar
 *
 */
@Configuration
@EnableJpaRepositories("com.dss.repository")
public class DaoConfig {
	    @Value("${driver}")
        private String driver;
	    @Value("${url}")
        private String url;
	    @Value("${username}")
        private String userName;
	    @Value("${password}")
        private String password;
	    
	    @Bean(name="con")
	    public static  PropertyPlaceholderConfigurer getConfigure()
	    {
	    	 PropertyPlaceholderConfigurer configurer=new PropertyPlaceholderConfigurer();
	    	 configurer.setLocation(new ClassPathResource("application.properties"));
	    	 return configurer;
	    }
	    
	    @Bean(name="ds")
	    public DataSource getDs()
	    {
	    	BasicDataSource dataSource=new BasicDataSource();
	        dataSource.setDriverClassName(driver);
	        dataSource.setUrl(url);
	        dataSource.setUsername(userName);
	        dataSource.setPassword(password);
	        return dataSource;
	    }
	    
	    @Bean(name="locSesfact")
	    public LocalContainerEntityManagerFactoryBean getBean()
	    {
	    	LocalContainerEntityManagerFactoryBean factoryBean=new LocalContainerEntityManagerFactoryBean();
	    	factoryBean.setDataSource(getDs());
	    	factoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
	    	Properties properties=new Properties();
	    	properties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
	    	properties.setProperty("hibernate.show_sql","true");
	    	properties.setProperty("hibernate.format_sql","true");
	    	factoryBean.setJpaProperties(properties);
	    	factoryBean.setPackagesToScan("com.dss.model");
	    	return factoryBean;
	    }
	    
	    @Primary
	    @Bean(name="entityManagerFactory")
	    public EntityManagerFactory getFactory()
	    {
	          return getBean().getObject();	
	    }
	 
	    /**
	   	 * @return HibernateTransactionManager Object
	   	 */
	    @Bean(name="transactionManager")
	    public JpaTransactionManager getTxMgr()
	    {
	    	 JpaTransactionManager transactionManager=new JpaTransactionManager();
	    	 transactionManager.setDataSource(getDs());
	    	 transactionManager.setEntityManagerFactory(getFactory());
	    	 return transactionManager;
	    }
}

