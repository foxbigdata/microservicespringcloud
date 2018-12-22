package com.itheima.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author 36krphplirui
 *
 */
@SpringBootApplication
@EnableCircuitBreaker    //开启断路器功能
@EnableEurekaClient
public class Application {
	
	/**
	 * 
	 * @return
	 */
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
