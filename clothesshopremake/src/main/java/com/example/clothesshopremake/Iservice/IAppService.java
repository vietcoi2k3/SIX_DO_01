package com.example.clothesshopremake.Iservice;

import java.util.List;

import com.example.clothesshopremake.entity.AccountBag;
import com.example.clothesshopremake.entity.AccountShipContact;
import com.example.clothesshopremake.entity.Product;
import com.example.clothesshopremake.entity.Resonobject.AccountCustom;
import com.example.clothesshopremake.entity.Resonobject.CreateAccountData;
import com.example.clothesshopremake.entity.Resonobject.CreateOrder;
import com.example.clothesshopremake.entity.Resonobject.OrderObject;
import com.example.clothesshopremake.entity.Resonobject.ProductDetail;
import com.example.clothesshopremake.entity.Resonobject.RemakeAccountRequest;
import com.example.clothesshopremake.entity.Resonobject.ShowAccountBag;





public interface IAppService {
	public List<Product> nextPage(int id);
	
	public ProductDetail getProductById(int productId);
	
	public CreateAccountData createAccountAndAccountShipContact(CreateAccountData accountData);
	
	public AccountCustom getAccountContacts(int accountId);
	
	public AccountCustom CheckLogin(String userName,String pass);
	
	public RemakeAccountRequest remakeAccountInfo(RemakeAccountRequest data);
	
	public AccountShipContact addNewAccountShipContact(AccountShipContact data);
	
	 public List<OrderObject> getOrderObjectByAccountId(int accountId);
	 
	 public AccountBag addProduct2Bag( int accountId, int productId, int quantity);
	 
	 public List<ShowAccountBag> getProductBagByAccountID(Integer accountId);
	 
	 public CreateOrder createOrder(Integer[] listIdAccountBag);
}
