package com.ram.srsc.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(nullable = false)
	String name;
	
	int age;
	String Email;
	
	public Users() {}
	
	public Users(Long id, String name, int age, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Email = email;
	}


	public long getId() {
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", age=" + age + ", Email=" + Email + "]";
	}
	
	
	
}