package com.Model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import com.Model.Product;

@Entity
@Component
public class Supplier {
	@Id
	@Column
	private String sid;
	
	@Column
	private String name;
	
	@Column
	private String address;
	@OneToMany(mappedBy="supplier" ,fetch=FetchType.EAGER)
	private Set<Product> products;
	public Set<Product> getproducts(){
		return products;
	}
	public void setproducts(Set<Product> products){
		this.products=products;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
