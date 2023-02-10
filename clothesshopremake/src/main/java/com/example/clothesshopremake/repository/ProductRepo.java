package com.example.clothesshopremake.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.clothesshopremake.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
//	
	@Query(value = "select * from product where categorytypeid=1", nativeQuery = true)
	List<Product> dressCategory();
	
	@Query(value = "select * from product where categorytypeid=2", nativeQuery = true)
	List<Product> pantCategory();
	
	@Query(value = "select * from product where categorytypeid=3", nativeQuery = true)
	List<Product> shirtCategory();
}
