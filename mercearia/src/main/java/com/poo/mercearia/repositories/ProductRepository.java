package com.poo.mercearia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poo.mercearia.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
