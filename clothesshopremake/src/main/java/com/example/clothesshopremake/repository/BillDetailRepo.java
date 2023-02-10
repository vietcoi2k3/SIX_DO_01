package com.example.clothesshopremake.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clothesshopremake.entity.BillDetail;

@Repository
public interface BillDetailRepo extends JpaRepository<BillDetail, Integer>{

}
