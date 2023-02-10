package com.example.clothesshopremake.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table
public class SalesStatus {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "salesstatusid")
	    private Integer salesStatusId;
	    
	    @Column(name = "salesstatuscode")
	    private String salesStatusCode;
	    
	    @Column(name = "salesstatusdetail")
	    private String salesStatusDetail; 
	    
	    @OneToMany(fetch = FetchType.LAZY, mappedBy = "salesStatus")
	    @JsonManagedReference
	    private List<Sales> saless;

	    public Integer getSalesStatusId() {
	        return salesStatusId;
	    }

	    public void setSalesStatusId(Integer salesStatusId) {
	        this.salesStatusId = salesStatusId;
	    }

	    public String getSalesStatusCode() {
	        return salesStatusCode;
	    }

	    public void setSalesStatusCode(String salesStatusCode) {
	        this.salesStatusCode = salesStatusCode;
	    }

	    public String getSalesStatusDetail() {
	        return salesStatusDetail;
	    }

	    public void setSalesStatusDetail(String salesStatusDetail) {
	        this.salesStatusDetail = salesStatusDetail;
	    }

	    public List<Sales> getSaless() {
	        return saless;
	    }

	    public void setSaless(List<Sales> saless) {
	        this.saless = saless;
	    }
}
