package com.poo.mercearia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poo.mercearia.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
