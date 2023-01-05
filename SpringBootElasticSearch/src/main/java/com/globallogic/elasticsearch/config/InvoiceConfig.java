package com.globallogic.elasticsearch.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;

@Configuration
public class InvoiceConfig {
	
	@Bean
	public RestClient getRestClient(){
		
		RestClient restClient = RestClient.builder(new HttpHost("localhost",9200,"http")).build();
		return restClient;
	}
	
	@Bean
	public ElasticsearchTransport getElasticSearchTransport() {
		return new RestClientTransport(getRestClient(), new JacksonJsonpMapper());
	}
	
	@Bean
	public ElasticsearchClient getElasticsearchClient() {
		ElasticsearchClient client = new ElasticsearchClient(getElasticSearchTransport());
		return client;
	}
 
}
