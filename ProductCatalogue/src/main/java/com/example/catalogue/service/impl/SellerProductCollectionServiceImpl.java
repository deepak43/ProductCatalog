package com.example.catalogue.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogue.dao.SellerProductCollectionRepository;
import com.example.catalogue.service.SellerProductCollectionService;

@Service
public class SellerProductCollectionServiceImpl implements SellerProductCollectionService {

	@Autowired
	private SellerProductCollectionRepository sellerProductCollectionRepository;
	
	@Override
	public Integer getNoOfUnitsPerSeller(int sellerId) {
		return sellerProductCollectionRepository.findUnitsBySellerId(sellerId);
	}

	@Override
	public Integer getNoOfUnitsBySku(String sku) {
		return sellerProductCollectionRepository.findNoOfUnitsBySku(sku);
	}

}
