package com.poo.mercearia.dtos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.poo.mercearia.entities.Employee;

public class EmployeeDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private LocalDate registrationDate;
	private LocalDate resignationDate;
	private Double salary;
	private AddressDto address;
	private RoleDto role;
	private List<OrderDto> orders = new ArrayList<>();
	
	public EmployeeDto() {}
	
	public EmployeeDto(Long id, String name, LocalDate registrationDate, LocalDate resignationDate, Double salary,
			AddressDto address, RoleDto role) {
		this.id = id;
		this.name = name;
		this.registrationDate = registrationDate;
		this.resignationDate = resignationDate;
		this.salary = salary;
		this.address = address;
		this.role = role;
	}
	
	public EmployeeDto(Employee employee) {
		this.id = employee.getId();
		this.name = employee.getName();
		this.registrationDate = employee.getRegistrationDate();
		this.resignationDate = employee.getResignationDate();
		this.salary = employee.getSalary();
		this.address = new AddressDto(employee.getAddress());
		this.role = new RoleDto(employee.getRole());
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

	public LocalDate getResignationDate() {
		return resignationDate;
	}

	public void setResignationDate(LocalDate resignationDate) {
		this.resignationDate = resignationDate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
		this.address = address;
	}

	public RoleDto getRole() {
		return role;
	}

	public void setRole(RoleDto role) {
		this.role = role;
	}

	public List<OrderDto> getOrders() {
		return orders;
	}
}
