package com.example.clothesshopremake.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clothesshopremake.entity.Brand;

@Repository
public interface BrandRepo extends JpaRepository<Brand,Integer >{

}
