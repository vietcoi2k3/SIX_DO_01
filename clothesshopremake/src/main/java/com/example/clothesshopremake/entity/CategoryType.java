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
@Table(name = "CategoryType")
public class CategoryType {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="categorytypeid")
	    private Integer categoryTypeId;
	    @Column(name = "categerytypecode")
	    private String categoryTypeCode;
	    @Column(name = "categerytypedetail")
	    private String categoryTypeDetail;
	    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoryType")
	    @JsonManagedReference
	    private List<Product> products;

	    public Integer getCategoryTypeId() {
	        return categoryTypeId;
	    }

	    public void setCategoryTypeId(Integer categoryTypeId) {
	        this.categoryTypeId = categoryTypeId;
	    }

	    public String getCategoryTypeCode() {
	        return categoryTypeCode;
	    }

	    public void setCategoryTypeCode(String categoryTypeCode) {
	        this.categoryTypeCode = categoryTypeCode;
	    }

	    public String getCategoryTypeDetail() {
	        return categoryTypeDetail;
	    }

	    public void setCategoryTypeDetail(String categoryTypeDetail) {
	        this.categoryTypeDetail = categoryTypeDetail;
	    }

	    public List<Product> getProducts() {
	        return products;
	    }

	    public void setProducts(List<Product> products) {
	        this.products = products;
	    }
}
