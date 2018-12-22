package com.itheima.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author 36krphplirui
 *
 */
@SpringBootApplication
@EnableEurekaServer     //表明是一个注册中心服务
public class EurekaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}
}
