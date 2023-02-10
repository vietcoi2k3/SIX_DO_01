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
@Table
public class Role {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "roleid")
	    private int roleId;
	    @Column(name = "rolecode")
	    private String roleCode;
	    @Column(name = "roledetail")
	    private String roleDetail;
	    @OneToMany(fetch = FetchType.LAZY,mappedBy = "role")
	    @JsonManagedReference
	    private List<Accounts> accounts;

	    public int getRoleId() {
	        return roleId;
	    }

	    public void setRoleId(int roleId) {
	        this.roleId = roleId;
	    }

	    public String getRoleCode() {
	        return roleCode;
	    }

	    public void setRoleCode(String roleCode) {
	        this.roleCode = roleCode;
	    }

	    public String getRoleDetail() {
	        return roleDetail;
	    }

	    public void setRoleDetail(String roleDetail) {
	        this.roleDetail = roleDetail;
	    }

	    public List<Accounts> getAccounts() {
	        return accounts;
	    }

	    public void setAccounts(List<Accounts> accounts) {
	        this.accounts = accounts;
	    }
}
