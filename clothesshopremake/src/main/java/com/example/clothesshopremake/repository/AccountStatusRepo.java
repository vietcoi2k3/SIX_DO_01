package com.example.clothesshopremake.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clothesshopremake.entity.AccountStatus;

@Repository
public interface AccountStatusRepo extends JpaRepository<AccountStatus, Integer>{

}
