package com.itheima.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itheima.springcloud.po.Order;
@RestController
public class OrderController {
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/order/{id}")
	public String findOrderById(@PathVariable String id) {
		Order order = new Order();
		order.setId("123");
		order.setPrice(23.5);
		order.setReceiverAddress("北京市昌平区");
		order.setReceiverName("小韩");
		order.setReceverPhone("19216800011");
		return order.toString();
	}

}
