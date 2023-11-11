package com.jobportal.jobsearch.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class AddressEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@JsonProperty("addressType")
	@Column(name = "address_type")
	String addressType;
	
	@Column(name = "street")
	String street;
	
	@Column(name = "dist")
	String dist;
	
	@Column(name = "state")
	String state;
	
	@Column(name = "country")
	String country;
	
	@Column(name = "postal_code")
	String postal_code;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	@Override
	public String toString() {
		return "AddressEntity [id=" + id + ", street=" + street + ", dist=" + dist + ", state=" + state + ", country="
				+ country + ", postal_code=" + postal_code + "]";
	}
	
}
