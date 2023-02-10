package com.example.clothesshopremake.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "ProductImg")
public class ProductImg {
	    @Id
	    @Column(name = "productimgid")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer productImgId;

	    @Column(name = "productid")
	    private Integer productId;

	    @Column(name = "countimg")
	    private Integer countImg;

	    @Column(name = "productimg", columnDefinition = "longblob")
	    private byte[] productImg;

	    @ManyToOne
	    @JoinColumn(name = "productid", updatable = false, insertable = false)
	    @JsonBackReference
	    private Product product;

	    public Integer getProductImgId() {
	        return productImgId;
	    }

	    public void setProductImgId(Integer productImgId) {
	        this.productImgId = productImgId;
	    }

	    public Integer getProductId() {
	        return productId;
	    }

	    public void setProductId(Integer productId) {
	        this.productId = productId;
	    }

	    public Integer getCountImg() {
	        return countImg;
	    }

	    public void setCountImg(Integer countImg) {
	        this.countImg = countImg;
	    }

	    public byte[] getProductImg() {
	        return productImg;
	    }

	    public void setProductImg(byte[] productImg) {
	        this.productImg = productImg;
	    }

	    public Product getProduct() {
	        return product;
	    }

	    public void setProduct(Product product) {
	        this.product = product;
	    }
}
