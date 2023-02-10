package com.example.clothesshopremake.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clothesshopremake.entity.Producer;

@Repository
public interface ProducerRepo extends JpaRepository<Producer, Integer>{

}
