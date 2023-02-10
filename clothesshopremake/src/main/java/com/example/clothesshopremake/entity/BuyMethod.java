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

import antlr.collections.List;
@Entity
@Table(name = "BuyMethod")
public class BuyMethod {
		@Id
	    @Column(name="buymethodid")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer buyMethodId;
		
	    @Column(name="buymethodcode")
	    private String buyMethodCode;
	    
	    @Column(name="buymethodname")
	    private String buyMethodName;
	    
	    @OneToMany(mappedBy = "buyMethod")
	    @JsonManagedReference
	    private Set<Bill> bill;


		public Set<Bill> getBill() {
			return bill;
		}

		public void setBill(Set<Bill> bill) {
			this.bill = bill;
		}

		public Integer getBuyMethodId() {
			return buyMethodId;
		}

		public void setBuyMethodId(Integer buyMethodId) {
	        this.buyMethodId = buyMethodId;
	    }

	    public String getBuyMethodCode() {
	        return buyMethodCode;
	    }

	    public void setBuyMethodCode(String buyMethodCode) {
	        this.buyMethodCode = buyMethodCode;
	    }

	    public String getBuyMethodName() {
	        return buyMethodName;
	    }

	    public void setBuyMethodName(String buyMethodName) {
	        this.buyMethodName = buyMethodName;
	    }

}
