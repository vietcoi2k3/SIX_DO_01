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
@Table(name = "votestar")
public class VoteStar {
	
		@Id
	    @Column(name = "votestarid")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer voteStarId;

	    @Column(name = "productid", updatable = false, insertable = false)
	    private Integer productId;

	    @Column(name = "accountid", updatable = false, insertable = false)
	    private Integer accountId;

	    @Column(name = "starvoted")
	    private Integer starVoted;

	    @ManyToOne
	    @JoinColumn(name = "productid")
	    @JsonBackReference
	    private Product product;

	    @ManyToOne
	    @JoinColumn(name = "accountid")
	    @JsonBackReference
	    private Accounts account;

	    public Integer getVoteStarId() {
	        return voteStarId;
	    }

	    public void setVoteStarId(Integer voteStarId) {
	        this.voteStarId = voteStarId;
	    }

	    public Integer getProductId() {
	        return productId;
	    }

	    public void setProductId(Integer productId) {
	        this.productId = productId;
	    }

	    public Integer getAccountId() {
	        return accountId;
	    }

	    public void setAccountId(Integer accountId) {
	        this.accountId = accountId;
	    }

	    public Integer getStarVoted() {
	        return starVoted;
	    }

	    public void setStarVoted(Integer starVoted) {
	        this.starVoted = starVoted;
	    }

	    public Product getProduct() {
	        return product;
	    }

	    public void setProduct(Product product) {
	        this.product = product;
	    }

	    public Accounts getAccount() {
	        return account;
	    }

	    public void setAccount(Accounts account) {
	        this.account = account;
	    }
}
