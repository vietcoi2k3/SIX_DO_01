package com.example.clothesshopremake.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clothesshopremake.entity.AccountShipContact;

@Repository
public interface AccountShipContactRepo extends JpaRepository<AccountShipContact, Integer>{

}
