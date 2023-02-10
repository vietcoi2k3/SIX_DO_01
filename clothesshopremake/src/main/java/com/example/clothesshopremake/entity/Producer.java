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
@Table(name = "Producer")
public class Producer {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "producerid")
	    private Integer producerId; 
	    
	    @Column(name = "producercode")
	    private String producerCode;
	    
	    @Column(name = "producerdetail")
	    private String producerDetail;
	    
	    @OneToMany(mappedBy = "producer")
	    @JsonManagedReference
	    private Set<Product> products;

		public Set<Product> getProduct() {
			return products;
		}

		public void setProduct(Set<Product> products) {
			this.products = products;
		}

		public Integer getProducerId() {
	        return producerId;
	    }

	    public void setProducerId(Integer producerId) {
	        this.producerId = producerId;
	    }

	    public String getProducerCode() {
	        return producerCode;
	    }

	    public void setProducerCode(String producerCode) {
	        this.producerCode = producerCode;
	    }

	    public String getProducerDetail() {
	        return producerDetail;
	    }

	    public void setProducerDetail(String producerDetail) {
	        this.producerDetail = producerDetail;
	    }

}
