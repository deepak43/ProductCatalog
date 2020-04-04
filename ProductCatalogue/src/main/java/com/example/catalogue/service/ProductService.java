package com.example.catalogue.service;

import java.util.List;

import com.example.catalogue.entity.Product;

public interface ProductService {

	public List<Product> getAll();
	public List<Product> getAllProductsByBrand(int brandId);
	public List<Product> getAllProductsByPriceGreaterThan(double price);
	public List<Product> getAllProductsByPriceLesserThan(double price);
	public List<Product> getAllProductsByColor(String color);
	public List<Product> getAllProductsBySize(String size);
}
