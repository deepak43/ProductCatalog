package com.example.catalogue.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogue.dao.ProductRepository;
import com.example.catalogue.entity.Product;
import com.example.catalogue.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}

	@Override
	public List<Product> getAllProductsByBrand(int brandId) {
		return productRepository.findByBrandId(brandId);
	}

	@Override
	public List<Product> getAllProductsByPriceGreaterThan(double price) {
		return productRepository.findByPriceGreaterThan(price);
	}

	@Override
	public List<Product> getAllProductsByPriceLesserThan(double price) {
		return productRepository.findByPriceLessThan(price);
	}

	@Override
	public List<Product> getAllProductsByColor(String color) {
		return productRepository.findByColor(color);
	}

	@Override
	public List<Product> getAllProductsBySize(String size) {
		return productRepository.findBySize(size);
	}

}
