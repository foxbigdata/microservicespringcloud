package com.itheima.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * 
 * @author 36krphplirui
 *
 */
@RestController
public class UserController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/findOrdersByUser/{id}")
	@HystrixCommand(fallbackMethod = "fallbackInfo")
	public String findOrdersByUser(@PathVariable String id) {
		Integer oid = Integer.parseInt(id);
		return this.restTemplate.getForObject("http://microservice-eureka-order/order/"+oid, String.class);
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public String fallbackInfo(@PathVariable String id) {
		return "服务不可用，请稍后再试！";
	}
}

































