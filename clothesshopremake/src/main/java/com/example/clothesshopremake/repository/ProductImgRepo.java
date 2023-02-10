package com.example.clothesshopremake.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clothesshopremake.entity.ProductImg;

@Repository
public interface ProductImgRepo extends JpaRepository<ProductImg, Integer>{

}
