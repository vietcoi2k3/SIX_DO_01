package com.example.clothesshopremake.entity;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.IdClass;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "BillStatus")
public class BillStatus {
	@Id
    @Column(name = "billstatusid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer billStatusId;
	
    @Column(name = "billstatuscode")
    private String billStatusCode;
    
    @Column(name = "billstatusdetail")
    private String billStatusDetail;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "billStatus")
    @JsonManagedReference
    private List<Bill> bills;

    public Integer getBillStatusId() {
        return billStatusId;
    }

    public void setBillStatusId(Integer billStatusId) {
        this.billStatusId = billStatusId;
    }

    public String getBillStatusCode() {
        return billStatusCode;
    }

    public void setBillStatusCode(String billStatusCode) {
        this.billStatusCode = billStatusCode;
    }

    public String getBillStatusDetail() {
        return billStatusDetail;
    }

    public void setBillStatusDetail(String billStatusDetail) {
        this.billStatusDetail = billStatusDetail;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }	
}
