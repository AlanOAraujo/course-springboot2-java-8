package br.com.encoded.nave.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.encoded.nave.entities.Order;
import br.com.encoded.nave.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository userRepository;

	public List<Order> findAll(){
		return userRepository.findAll();
	}
	
	public Order findById(Long id) {
		
		Optional<Order> order = userRepository.findById(id);
		return order.get(); 
	}
	
}
