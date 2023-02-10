package com.example.clothesshopremake.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clothesshopremake.entity.CategoryType;

@Repository
public interface CategoryTypeRepo extends JpaRepository<CategoryType, Integer>{

}
