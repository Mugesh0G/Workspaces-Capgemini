package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String city;
	private String state;
//	
//	@ManyToMany
//	Message message;
//	
//	public Message getMessage() {
//		return message;
//	}
//	public void setMessage(Message message) {
//		this.message = message;
//	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	public Address(int id, String city, String state) {
		super();
		Id = id;
		this.city = city;
		this.state = state;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

}
