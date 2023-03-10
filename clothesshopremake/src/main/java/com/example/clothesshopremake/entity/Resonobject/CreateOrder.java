package com.example.clothesshopremake.entity.Resonobject;

import java.util.List;

import com.example.clothesshopremake.entity.AccountShipContact;
import com.example.clothesshopremake.entity.BuyMethod;
import com.example.clothesshopremake.entity.Sales;
import com.example.clothesshopremake.entity.ShipMethod;



public class CreateOrder {
	
	  private List<Sales> salesOfBill;
	    private List<BuyMethod> buyMethods;
	    private List<ShipMethod> shipMethods;
	    private List<OrderItem> orderItems;
	    private List<AccountShipContact> accountShipContacts;

	    public List<AccountShipContact> getAccountShipContacts() {
	        return accountShipContacts;
	    }

	    public void setAccountShipContacts(List<AccountShipContact> accountShipContacts) {
	        this.accountShipContacts = accountShipContacts;
	    }

	    public List<Sales> getSalesOfBill() {
	        return salesOfBill;
	    }

	    public void setSalesOfBill(List<Sales> salesOfBill) {
	        this.salesOfBill = salesOfBill;
	    }

	    public List<BuyMethod> getBuyMethods() {
	        return buyMethods;
	    }

	    public void setBuyMethods(List<BuyMethod> buyMethods) {
	        this.buyMethods = buyMethods;
	    }

	    public List<ShipMethod> getShipMethods() {
	        return shipMethods;
	    }

	    public void setShipMethods(List<ShipMethod> shipMethods) {
	        this.shipMethods = shipMethods;
	    }

	    public List<OrderItem> getOrderItems() {
	        return orderItems;
	    }

	    public void setOrderItems(List<OrderItem> orderItems) {
	        this.orderItems = orderItems;
	    }
}
