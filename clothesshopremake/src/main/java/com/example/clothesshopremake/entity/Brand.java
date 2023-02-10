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
@Table(name = "Brand")
public class Brand{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="brandid")
    private Integer brandId;
	
    @Column(name="brandcode")
    private String brandCode;
    
    @Column(name="branddetail")
    private String brandDetail;
    
    @OneToMany(mappedBy = "brand")
    @JsonManagedReference
    private Set<Product> products;

    
    public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getBrandDetail() {
        return brandDetail;
    }

    public void setBrandDetail(String brandDetail) {
        this.brandDetail = brandDetail;
    }

}
