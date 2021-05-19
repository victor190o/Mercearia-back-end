package com.poo.mercearia.dtos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.poo.mercearia.entities.Order;

public class OrderDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Double totalPrice;
	private ClientDto client;
	private EmployeeDto employee;
	private Set<ProductDto> products = new HashSet<>();
	
	public OrderDto() {}

	public OrderDto(Long id, Double totalPrice) {
		this.id = id;
		this.totalPrice = totalPrice;
	}
	
	public OrderDto(Order order) {
		this.id = order.getId();
		this.totalPrice = order.getTotalPrice();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Set<ProductDto> products) {
		for (ProductDto product : products) {
			this.totalPrice += product.getPrice() * product.getQuantity();
		}
	}

	public Set<ProductDto> getProducts() {
		return products;
	}
	
	public ClientDto getClient() {
		return client;
	}

	public EmployeeDto getEmployee() {
		return employee;
	}
}
