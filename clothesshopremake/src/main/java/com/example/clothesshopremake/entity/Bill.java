package com.example.clothesshopremake.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "Bill")
public class Bill {
	@Id
    @Column(name = "billid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer billId;
	
    @Column(name = "billcode")
    private String billCode;
    
    @Column(name = "accountshipcontactid")
    private Integer accountShipContactId;
    
    @Column(name = "buymethodid")
    private Integer buyMethodId;
    
    @Column(name = "createdate")
    private LocalDate createDate;
    
    @Column(name = "shiptobuyerdate")
    private LocalDate shipToBuyerDate;
    
    @Column(name = "receiveddate")
    private LocalDate receivedDate;
    
    @Column(name = "closedatetime")
    private LocalDate closeDateTime;
    
    @Column(name = "buyernotification")
    private String buyerNotification;
    
    @Column(name = "billstatusid")
    private Integer billStatusId;
    
    @Column(name = "totalbill")
    private Double totalBill;
    
    @OneToMany(mappedBy = "bill", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<BillDetail> billDetails;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bill")
    @JsonManagedReference
    private List<BillSales> billSalesList;
    
    @Column(name = "shipmethodid")
    private Integer shipMethodId;
    
    @Column(name = "shipprice")
    private Double shipPrice;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "shipmethodid", insertable = false, updatable = false)
    private ShipMethod shipMethod;
    
    @ManyToOne
    @JoinColumn(name = "buymethodid", updatable = false, insertable = false)
    @JsonBackReference
    private BuyMethod buyMethod;
    
    @ManyToOne
    @JoinColumn(name = "accountshipcontactid", updatable = false, insertable = false)
    @JsonBackReference
    private AccountShipContact accountShipContact;
    
    @JoinColumn(name = "billstatusid", updatable = false, insertable = false)
    @ManyToOne
    @JsonBackReference
    private BillStatus billStatus;

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public Double getShipPrice() {
        return shipPrice;
    }

    public void setShipPrice(Double shipPrice) {
        this.shipPrice = shipPrice;
    }

    public Double getTotalBill() {
        return totalBill;
    }

    public Integer getShipMethodId() {
        return shipMethodId;
    }

    public void setShipMethodId(Integer shipMethodId) {
        this.shipMethodId = shipMethodId;
    }

    public ShipMethod getShipMethod() {
        return shipMethod;
    }

    public void setShipMethod(ShipMethod shipMethod) {
        this.shipMethod = shipMethod;
    }

    public void setTotalBill(Double totalBill) {
        this.totalBill = totalBill;
    }

    public Integer getBillId() {
        return billId;
    }

    public List<BillSales> getBillSalesList() {
        return billSalesList;
    }

    public void setBillSalesList(List<BillSales> billSalesList) {
        this.billSalesList = billSalesList;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Integer getAccountShipContactId() {
        return accountShipContactId;
    }

    public void setAccountShipContactId(Integer accountShipContactId) {
        this.accountShipContactId = accountShipContactId;
    }

    public Integer getBuyMethodId() {
        return buyMethodId;
    }

    public void setBuyMethodId(Integer buyMethodId) {
        this.buyMethodId = buyMethodId;
    }


    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getShipToBuyerDate() {
        return shipToBuyerDate;
    }

    public void setShipToBuyerDate(LocalDate shipToBuyerDate) {
        this.shipToBuyerDate = shipToBuyerDate;
    }

    public LocalDate getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(LocalDate receivedDate) {
        this.receivedDate = receivedDate;
    }

    public LocalDate getCloseDateTime() {
        return closeDateTime;
    }

    public void setCloseDateTime(LocalDate closeDateTime) {
        this.closeDateTime = closeDateTime;
    }

    public String getBuyerNotification() {
        return buyerNotification;
    }

    public void setBuyerNotification(String buyerNotification) {
        this.buyerNotification = buyerNotification;
    }

    public Integer getBillStatusId() {
        return billStatusId;
    }

    public void setBillStatusId(Integer billStatusId) {
        this.billStatusId = billStatusId;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public BuyMethod getBuyMethod() {
        return buyMethod;
    }

    public void setBuyMethod(BuyMethod buyMethod) {
        this.buyMethod = buyMethod;
    }


    public AccountShipContact getAccountShipContact() {
        return accountShipContact;
    }

    public void setAccountShipContact(AccountShipContact accountShipContact) {
        this.accountShipContact = accountShipContact;
    }

    public List<BillDetail> getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(List<BillDetail> billDetails) {
        this.billDetails = billDetails;
    }
}
