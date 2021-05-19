package com.poo.mercearia.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Address implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String number;
	private String publicPlace;
	private String complement;
	private String district;
	private String city;
	private String state;
	
	public Address() {}

	public Address(String number, String publicPlace, String complement, String district, String city,
			String state) {
		this.number = number;
		this.publicPlace = publicPlace;
		this.complement = complement;
		this.district = district;
		this.city = city;
		this.state = state;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPublicPlace() {
		return publicPlace;
	}

	public void setPublicPlace(String publicPlace) {
		this.publicPlace = publicPlace;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
