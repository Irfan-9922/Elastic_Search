/**
 * 
 */
package com.dss.config;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * @author s.parmar
 *
 */
@Configuration
@EnableElasticsearchRepositories(basePackages = "com.dss.repositories")
public class ElasticSearchConfigration {

	@Value("${elasticsearch.host}")
	private String hostName;
	
	@Value("${elasticsearch.port}")
	private int port;
	
	@Value("${elasticsearch.clustername}")
	private String clusterName;

	@Bean
	public Client client() throws UnknownHostException {
		Settings builder = Settings.settingsBuilder().put("cluster.name", clusterName).build();
		return TransportClient.builder().settings(builder).build()
				.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(hostName),port));
	}

	@Bean
	public ElasticsearchOperations template() throws UnknownHostException {
		return new ElasticsearchTemplate(client());
	}

}
