package com.example.catalogue.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_categories")
public class ProductCategories {

	@Id
	@Column(name = "category_id")
	private int id;
	
	@Column(name = "category_name")
	private String size;

	public ProductCategories()
	{
	}

	public ProductCategories(int id, String size) {
		super();
		this.id = id;
		this.size = size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
}
