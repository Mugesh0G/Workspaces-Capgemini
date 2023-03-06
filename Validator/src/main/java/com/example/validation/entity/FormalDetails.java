package com.example.validation.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.example.validation.repository.checkvalidpassword;


@Entity
public class FormalDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@NotEmpty
	@Size(min = 3,message = "name could be empty / more than 3_characters")
	String name;
	@Email(message = "email should be in good format")
	@NotEmpty(message = "email should not be empty")
	String email;
	@checkvalidpassword
	String Password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public FormalDetails(int id, @NotEmpty @Size(min = 3) String name, @Email @NotEmpty String email,
			@NotEmpty @Size(min = 8) String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		Password = password;
	}

	public FormalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
