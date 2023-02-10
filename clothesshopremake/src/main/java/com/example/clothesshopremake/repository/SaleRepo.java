package com.example.clothesshopremake.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.clothesshopremake.entity.Sales;

@Repository
public interface SaleRepo extends JpaRepository<Sales, Integer>{
	 @Query(value = "select * from Sales where salesstatusid in (1,2)", nativeQuery = true)
	  public List<Sales> getAllOfBillWithoutOff();
}
