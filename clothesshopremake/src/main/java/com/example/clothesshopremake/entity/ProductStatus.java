package com.example.clothesshopremake.entity;

import java.util.Set;

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
public class ProductStatus {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "productstatusid")
	    private Integer productStatusId;
	    
	    @Column(name = "productstatuscode")
	    private String productStatusCode;
	    
	    @Column(name = "productstatusdetail")
	    private String productStatusDetail;
	    
	   

		public Integer getProductStatusId() {
	        return productStatusId;
	    }

	    public void setProductStatusId(Integer productStatusId) {
	        this.productStatusId = productStatusId;
	    }

	    public String getProductStatusCode() {
	        return productStatusCode;
	    }

	    public void setProductStatusCode(String productStatusCode) {
	        this.productStatusCode = productStatusCode;
	    }

	    public String getProductStatusDetail() {
	        return productStatusDetail;
	    }

	    public void setProductStatusDetail(String productStatusDetail) {
	        this.productStatusDetail = productStatusDetail;
	    }
}
