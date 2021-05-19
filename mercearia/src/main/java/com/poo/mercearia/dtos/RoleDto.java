package com.poo.mercearia.dtos;

import java.io.Serializable;

import com.poo.mercearia.entities.Role;

public class RoleDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String description;
	
	public RoleDto() {}

	public RoleDto(Long id, String description) {
		this.id = id;
		this.description = description;
	}
	
	public RoleDto(Role role) {
		this.id = role.getId();
		this.description = role.getDescription();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
