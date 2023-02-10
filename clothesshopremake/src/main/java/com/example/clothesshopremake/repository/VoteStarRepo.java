package com.example.clothesshopremake.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clothesshopremake.entity.VoteStar;

@Repository
public interface VoteStarRepo extends JpaRepository<VoteStar, Integer>{

}
