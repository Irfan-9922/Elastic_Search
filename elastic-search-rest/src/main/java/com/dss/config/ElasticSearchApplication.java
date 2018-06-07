package com.dss.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.dss.daoconfig.DaoConfig;
import com.dss.service_config.ServiceConfig;

/**
 * @author s.parmar
 *
 */
@SpringBootApplication
@Import(value={ServiceConfig.class,ElasticSearchConfigration.class,DaoConfig.class})
@ComponentScan(basePackages="com.dss.resources,com.dss.aop")
@EnableAspectJAutoProxy
public class ElasticSearchApplication {
	public static void main(String[] args) {
		SpringApplication.run(ElasticSearchApplication.class, args);
	}
}


