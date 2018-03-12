package com.divino.shardingjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.divino.shardingjdbc.entity.Order;
import com.divino.shardingjdbc.repository.OrderRepository;
import com.divino.shardingjdbc.service.OrderService;

@RestController  
public class Ordercontroller {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping(value = "/hello/{name}")  
    public String index(@PathVariable String name) {  
        return "oh you are " + name + "<br> nice to meet you";// \n不起作用了,那就直接用html中的标签吧  
    }  
	
	@GetMapping(value = "/order/{id}")  
    public String findById(@PathVariable Long id) {  
		Order order = orderService.findById(id);
		if (order != null)
			return "oh you are " + order.getUserId() + "<br> nice to meet you";// \n不起作用了,那就直接用html中的标签吧  
		else
			return "null";
    }  
}
