package com.example.clothesshopremake.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clothesshopremake.entity.SaleType;

@Repository
public interface SalesTypeRepo extends JpaRepository<SaleType, Integer>{

}
