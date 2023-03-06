package com.example.demo.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotBlank;


@Entity
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	
	@NotBlank
	private String content;
	
	
	
//	@ManyToMany
//	Set<Address>address;
//	
//	public Set<Address> getAddress() {
//		return address;
//	}
//	public void setAddress(Set<Address> address) {
//		this.address = address;
//	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Message(int id, String content) {
		super();
		Id = id;
		this.content = content;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	

}
