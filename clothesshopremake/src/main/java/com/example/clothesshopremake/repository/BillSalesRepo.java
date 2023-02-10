package com.example.clothesshopremake.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clothesshopremake.entity.BillSales;

@Repository
public interface BillSalesRepo extends JpaRepository<BillSales, Integer>{

}
