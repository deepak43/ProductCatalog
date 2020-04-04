package com.example.catalogue.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogue.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	List<Product> findByBrandId(int brandId);
	List<Product> findByPriceGreaterThan(double price);
	List<Product> findByPriceLessThan(double price);
	List<Product> findByColor(String color);
	List<Product> findBySize(String size);
}
