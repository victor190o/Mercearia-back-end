package com.poo.mercearia.dtos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.poo.mercearia.entities.Client;

public class ClientDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private LocalDate registrationDate;
	private AddressDto address;
	private List<OrderDto> orders = new ArrayList<>();
	
	public ClientDto() {}

	public ClientDto(Long id, String name, LocalDate registrationDate, AddressDto address) {
		this.id = id;
		this.name = name;
		this.registrationDate = registrationDate;
		this.address = address;
	}
	
	public ClientDto(Client client) {
		this.id = client.getId();
		this.name = client.getName();
		this.registrationDate = client.getRegistrationDate();
		this.address = new AddressDto(client.getAddress());
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

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
		this.address = address;
	}

	public List<OrderDto> getOrders() {
		return orders;
	}
}
