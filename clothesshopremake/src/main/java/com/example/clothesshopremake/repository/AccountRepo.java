package com.example.clothesshopremake.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.clothesshopremake.entity.Accounts;

@Repository
public interface AccountRepo extends JpaRepository<Accounts, Integer>{
		
	@Query(value = "select * from accounts where accountusername = :username",nativeQuery = true)
	Optional<Accounts> checkUserName(@Param("username") String username);
	
	@Query(value = "select * from accounts where accountusername =:userName and accountpassword =:pass",nativeQuery = true)
	Accounts checkLogin(@Param("userName") String userName,@Param("pass") String pass) ;
}
