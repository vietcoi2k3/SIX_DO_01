package com.example.clothesshopremake.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.clothesshopremake.entity.AccountBag;

@Repository
public interface AccountBagRepo extends JpaRepository<AccountBag, Integer>{
	
	@Query(value = "select * from accountbag where accountid = :accountId",nativeQuery = true)
	public List<AccountBag> findByAccountId(@Param("accountId") Integer accountId);
	
	@Query(value = "select * from accountbag where accountid = :acId and productid = :proId",nativeQuery = true )
	public AccountBag findByAccountIdAndProductId(@Param("acId") Integer accountID,@Param("proId") Integer productID);
}
