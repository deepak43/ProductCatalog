package com.example.catalogue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogue.entity.Product;
import com.example.catalogue.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("")
	public List<Product> getAllProducts()
	{
		return productService.getAll();
	}
	
	@GetMapping("/brand/{brandId}")
	public List<Product> getAllProductsByBrand(@PathVariable("brandId") int brandId)
	{
		return productService.getAllProductsByBrand(brandId);
	}
	
	@GetMapping("/pricegt/{price}")
	public List<Product> getAllProductsByPriceGreaterThan(@PathVariable double price)
	{
		return productService.getAllProductsByPriceGreaterThan(price);
	}
	
	@GetMapping("/pricelt/{price}")
	public List<Product> getAllProductsByPriceLesserThan(@PathVariable double price)
	{
		return productService.getAllProductsByPriceLesserThan(price);
	}
	
	@GetMapping("/color/{color}")
	public List<Product> getAllProductsByColor(@PathVariable String color)
	{
		return productService.getAllProductsByColor(color);
	}
	
	@GetMapping("/size/{size}")
	public List<Product> getAllProductsBySize(@PathVariable String size)
	{
		return productService.getAllProductsBySize(size);
	}
	
}
