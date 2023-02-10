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
@Table(name = "AccountStatus")
public class AccountStatus {
	@Id
    @Column(name="accountstatusid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountStatusId;

    @Column(name="accountstatuscode")
    private String accountStatusCode;

    @Column(name="accountstatusdetail")
    private String accountStatusDetail;
    @OneToMany(mappedBy = "accountStatus",fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Accounts> accounts;

    public Integer getAccountStatusId() {
        return accountStatusId;
    }

    public void setAccountStatusId(Integer accountStatusId) {
        this.accountStatusId = accountStatusId;
    }

    public String getAccountStatusCode() {
        return accountStatusCode;
    }

    public void setAccountStatusCode(String accountStatusCode) {
        this.accountStatusCode = accountStatusCode;
    }

    public String getAccountStatusDetail() {
        return accountStatusDetail;
    }

    public void setAccountStatusDetail(String accountStatusDetail) {
        this.accountStatusDetail = accountStatusDetail;
    }

    public List<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
    }
}
