package com.example.catalogue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogue.service.SellerProductCollectionService;

@RestController
@RequestMapping("/units")
public class SellerProductController {

	@Autowired
	SellerProductCollectionService collectionService;
	
	@RequestMapping("totalunits/seller/{sellerId}")
	public Integer getNoOfUnitsPerSeller(@PathVariable int sellerId)
	{
		return collectionService.getNoOfUnitsPerSeller(sellerId);
	}
	
	@RequestMapping("totalunits/sku/{sku}")
	public Integer getNoOfUnitsIdBySku(@PathVariable String sku)
	{
		return collectionService.getNoOfUnitsBySku(sku);
	}
}
