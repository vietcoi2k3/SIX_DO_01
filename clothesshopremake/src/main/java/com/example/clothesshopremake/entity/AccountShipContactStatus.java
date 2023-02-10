package com.example.clothesshopremake.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table
public class AccountShipContactStatus {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "accountshipcontactstatusid")
	    private Integer accountShipContactStatusId;
		
	    @Column(name = "accountshipcontactstatuscode")
	    private String accountShipContactStatusCode;
	    
	    @Column(name = "accountshipcontactstatuscodedetail")
	    private String accountShipContactStatusDetail;
	    
	    
	 

	    public Integer getAccountShipContactStatusId() {
	        return accountShipContactStatusId;
	    }

	    public void setAccountShipContactStatusId(Integer accountShipContactStatusId) {
	        this.accountShipContactStatusId = accountShipContactStatusId;
	    }

	    public String getAccountShipContactStatusCode() {
	        return accountShipContactStatusCode;
	    }

	    public void setAccountShipContactStatusCode(String accountShipContactStatusCode) {
	        this.accountShipContactStatusCode = accountShipContactStatusCode;
	    }

	    public String getAccountShipContactStatusDetail() {
	        return accountShipContactStatusDetail;
	    }

	    public void setAccountShipContactStatusDetail(String accountShipContactStatusDetail) {
	        this.accountShipContactStatusDetail = accountShipContactStatusDetail;
	    }
}
