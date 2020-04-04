package com.example.catalogue.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@Column(name = "prod_id")
	private int id;
	
	@Column(name = "category_id")
	private int categoryId;
	
	@Column(name = "brand_id")
	private int brandId;
	
	@Column(name = "prod_size")
	private String size;
	
	@Column(name = "prod_color")
	private String color;
	
	@Column(name = "prod_price")
	private double price;

	public Product()
	{
	}
	
	public Product(int id, int category_id, int brand_id, String size, String color, double price) {
		super();
		this.id = id;
		this.categoryId = category_id;
		this.brandId = brand_id;
		this.size = size;
		this.color = color;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategory_id() {
		return categoryId;
	}

	public void setCategory_id(int category_id) {
		this.categoryId = category_id;
	}

	public int getBrand_id() {
		return brandId;
	}

	public void setBrand_id(int brand_id) {
		this.brandId = brand_id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
