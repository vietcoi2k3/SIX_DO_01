package com.example.clothesshopremake.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
@Table
public class ShipMethod {
	  	@Id
	    @Column(name = "shipmethodid")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer shipMethodId;
	  	
	    @Column(name = "shipmethodcode")
	    private String shipMethodCode;
	    
	    @Column(name = "shipmethodname")
	    private String shipMethodName;
	    
	    @Column(name = "price")
	    private Integer price;
	    
	    @OneToMany(mappedBy = "shipMethod")
	    @JsonManagedReference
	    private	Set<Bill> bill;

	    public Integer getPrice() {
	        return price;
	    }

	    public void setPrice(Integer price) {
	        this.price = price;
	    }

	    public Integer getShipMethodId() {
	        return shipMethodId;
	    }

	    public void setShipMethodId(Integer shipMethodId) {
	        this.shipMethodId = shipMethodId;
	    }

	    public String getShipMethodCode() {
	        return shipMethodCode;
	    }

	    public void setShipMethodCode(String shipMethodCode) {
	        this.shipMethodCode = shipMethodCode;
	    }

	    public String getShipMethodName() {
	        return shipMethodName;
	    }

	    public void setShipMethodName(String shipMethodName) {
	        this.shipMethodName = shipMethodName;
	    }

}
