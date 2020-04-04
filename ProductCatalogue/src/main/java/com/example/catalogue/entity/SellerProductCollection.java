package com.example.catalogue.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seller_product_collection")
public class SellerProductCollection {

	@Id
	@Column(name = "collection_id")
	private int id;
	
	@Column(name = "seller_id")
	private int sellerId;
	
	@Column(name = "prod_id")
	private int productId;
	
	@Column(name = "sku")
	private String productSku;
	
	@Column(name = "no_of_units")
	private int noOfUnits;
	
	public SellerProductCollection()
	{
		
	}

	public SellerProductCollection(int id, int sellerId, int productId, int noOfUnits) {
		super();
		this.id = id;
		this.sellerId = sellerId;
		this.productId = productId;
		this.noOfUnits = noOfUnits;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductSku() {
		return productSku;
	}

	public void setProductSku(String productSku) {
		this.productSku = productSku;
	}

	public int getNoOfUnits() {
		return noOfUnits;
	}

	public void setNoOfUnits(int noOfUnits) {
		this.noOfUnits = noOfUnits;
	}
}
