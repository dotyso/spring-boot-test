package com.divino.shardingjdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divino.shardingjdbc.entity.Order;
import com.divino.shardingjdbc.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public Order findById(Long orderId) {
		return orderRepository.findById(orderId);
	}
}
