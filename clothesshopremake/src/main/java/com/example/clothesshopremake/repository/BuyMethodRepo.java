package com.example.clothesshopremake.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clothesshopremake.entity.BuyMethod;

@Repository
public interface BuyMethodRepo extends JpaRepository<BuyMethod, Integer>{

}
