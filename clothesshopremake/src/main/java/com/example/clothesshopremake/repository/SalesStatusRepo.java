package com.example.clothesshopremake.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clothesshopremake.entity.SalesStatus;

@Repository
public interface SalesStatusRepo extends JpaRepository<SalesStatus, Integer>{

}
