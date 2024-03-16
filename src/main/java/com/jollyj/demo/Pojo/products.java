package com.jollyj.demo.Pojo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "training")
public class products {
	
	@Id
	private int id;
	
	private String name;
	private String city;
	private int bounty;
	
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
	public int getBounty() {
		return bounty;
	}
	public void setBounty(int bounty) {
		this.bounty = bounty;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public products() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public products(int id, String name, int bounty, String city) {
		super();
		this.id = id;
		this.name = name;
		this.bounty = bounty;
		this.city = city;
	}
	
	public products(String name, String city, int bounty) {
		super();
		this.name = name;
		this.city = city;
		this.bounty = bounty;
	}
	
	@Override
	public String toString() {
		return "products [id=" + id + ", name=" + name + ", Bounty=" + bounty + ", city=" + city + "]";
	}
	

}
