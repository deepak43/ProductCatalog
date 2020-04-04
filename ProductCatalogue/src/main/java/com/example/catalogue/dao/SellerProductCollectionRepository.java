package com.example.catalogue.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.catalogue.entity.SellerProductCollection;

public interface SellerProductCollectionRepository extends JpaRepository<SellerProductCollection, Integer> {

	@Query("select c.noOfUnits from SellerProductCollection c where productSku=?1")
	public Integer findNoOfUnitsBySku(String sku);
	
	@Query("select SUM(c.noOfUnits) from SellerProductCollection c where sellerId=?1")
	public Integer findUnitsBySellerId(Integer sellerId);
}
