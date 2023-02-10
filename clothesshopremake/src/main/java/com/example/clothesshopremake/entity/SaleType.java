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
@Table(name = "saletype")
public class SaleType {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="saletypeid")
	    private Integer saleTypeId;
	 	
	    @Column(name="saletypecode")
	    private String saleTypeCode;
	    
	    @Column(name="saletypedetail")
	    private String saleTypeDetail;
	    
	    @OneToMany(mappedBy = "saleType")
	    @JsonManagedReference
	    private Set<Sales> sales;

	    public Integer getSaleTypeId() {
	        return saleTypeId;
	    }

	    public void setSaleTypeId(Integer saleTypeId) {
	        this.saleTypeId = saleTypeId;
	    }

	    public String getSaleTypeCode() {
	        return saleTypeCode;
	    }

	    public void setSaleTypeCode(String saleTypeCode) {
	        this.saleTypeCode = saleTypeCode;
	    }

	    public String getSaleTypeDetail() {
	        return saleTypeDetail;
	    }

	    public void setSaleTypeDetail(String saleTypeDetail) {
	        this.saleTypeDetail = saleTypeDetail;
	    }
}
