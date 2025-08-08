package com.example.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.model.Order;
import com.example.ecommerce.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<Order> getOrdersByUser(Long userId) {
		return orderRepository.findAll();
	}

	public Order saveOrder(Order order) {
		return orderRepository.save(order);
	}
}
