package com.example.catalogue.service;

public interface SellerProductCollectionService {

	public Integer getNoOfUnitsPerSeller(int sellerId);
	public Integer getNoOfUnitsBySku(String sku);
}
