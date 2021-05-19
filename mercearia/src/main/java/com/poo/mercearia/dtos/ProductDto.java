package com.poo.mercearia.dtos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.poo.mercearia.entities.Product;

public class ProductDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Double price;
	private Integer quantity;
	Set<OrderDto> orders = new HashSet<>();
	
	public ProductDto() {}

	public ProductDto(Long id, String name, Double price, Integer quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public ProductDto(Product product) {
		this.id = product.getId();
		this.name = product.getName();
		this.price = product.getPrice();
		this.quantity = product.getQuantity();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Set<OrderDto> getOrders() {
		return orders;
	}
}
