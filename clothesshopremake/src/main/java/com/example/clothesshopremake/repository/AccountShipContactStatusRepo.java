package com.example.clothesshopremake.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clothesshopremake.entity.AccountShipContactStatus;

@Repository
public interface AccountShipContactStatusRepo extends JpaRepository<AccountShipContactStatus,Integer >{

}
