package br.com.encoded.nave.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.encoded.nave.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
