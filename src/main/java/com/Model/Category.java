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
public class Category {
	@Id
	@Column
	private String cid;
	
	@Column
	private String cname;
	
	@Column
	private String cdescription;
	
	
	@OneToMany(mappedBy="category" ,fetch=FetchType.EAGER)
	private Set<Product> products;
	public Set<Product> getproducts(){
		return products;
	}
	public void setproducts(Set<Product> products){
		this.products=products;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCdescription() {
		return cdescription;
	}
	public void setCdescription(String cdescription) {
		this.cdescription = cdescription;
	}
	
}
