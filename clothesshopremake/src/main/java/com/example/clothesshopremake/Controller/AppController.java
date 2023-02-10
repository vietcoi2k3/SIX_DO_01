package com.example.clothesshopremake.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.clothesshopremake.Service.AppService;
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
import com.example.clothesshopremake.lib.GsonMix;
import com.example.clothesshopremake.repository.context.Dbcontext;





@RestController
@RequestMapping(value = "api/product1.0")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class AppController {
	
	@Autowired
	Dbcontext dbcontext;
	@Autowired
	AppService appService;
		@RequestMapping(method = RequestMethod.GET, value = "nextpage")
	    public List<Product> nextPage(@RequestParam int page) {
	        return appService.nextPage(page);
	 }
	 	@RequestMapping(method = RequestMethod.GET, value = "getproductid")
	    public ProductDetail getProductById(@RequestParam Integer id) {
	        return appService.getProductById(id);
	    }
	 	@RequestMapping(method = RequestMethod.GET, value = "checklogin")
	    public AccountCustom checkLogin(@RequestParam String userName, String userPass) {
	        return appService.CheckLogin(userName, userPass);
	    }
	 	@RequestMapping(method = RequestMethod.POST, value = "createaccount")
	    public CreateAccountData createAccount(@RequestBody String accountData) {
	    	System.out.println(accountData);
	        CreateAccountData account = GsonMix.gsonLocalDate().fromJson(accountData, CreateAccountData.class);
	        return appService.createAccountAndAccountShipContact(account);
	    }
	 
	 	@RequestMapping(method = RequestMethod.GET, value = "dress")
	    public List<Product> dressCategory() {
	        return dbcontext.productRepo.dressCategory();
	    }
	 	@RequestMapping(method = RequestMethod.GET, value = "pan")
	    public List<Product> panCategory() {
	        return dbcontext.productRepo.pantCategory();
	    }

	    @RequestMapping(method = RequestMethod.GET, value = "shirt")
	    public List<Product> shirtCategory() {
	        return dbcontext.productRepo.shirtCategory();
	    }
	    
	    @RequestMapping(method = RequestMethod.GET, value = "getcontacts")
	    public AccountCustom getAccountContacts(@RequestParam int accountId) {
	    	System.out.println(accountId);
	        return appService.getAccountContacts(accountId);
	    }
	    @RequestMapping(method = RequestMethod.PUT, value = "remakeaccount")
	    public RemakeAccountRequest remakeAccount(@RequestBody String remakeData) {
	        RemakeAccountRequest data = GsonMix.gsonLocalDate().fromJson(remakeData, RemakeAccountRequest.class);
	        return appService.remakeAccountInfo(data);
	    }
	    @RequestMapping(method = RequestMethod.POST, value = "addnewaccountshipcontact")
	    public AccountShipContact addNewAccountShipContact(@RequestBody String accountShipContactData) {
	        AccountShipContact accountShipContact = GsonMix.gsonLocalDate().fromJson(accountShipContactData, AccountShipContact.class);
	        return appService.addNewAccountShipContact(accountShipContact);
	    }
	    @RequestMapping(method = RequestMethod.GET, value = "getbilldetailbyaccountid")
	    public List<OrderObject> getBillDetail(@RequestParam Integer accountId) {
	        return appService.getOrderObjectByAccountId(accountId);
	    }
	    
	    @RequestMapping(method = RequestMethod.POST, value = "addproduct2bag")
	    public AccountBag addProduct2Bag(@RequestParam int accountId, int productId, int quantity) {
	        return appService.addProduct2Bag(accountId, productId, quantity);
	    }
	    
	    @RequestMapping(method = RequestMethod.GET, value = "getproductbagbyaccountid")
	    public List<ShowAccountBag> getBag(@RequestParam Integer accountId) {
	        return appService.getProductBagByAccountID(accountId);
	    }
	    
	    @RequestMapping(method = RequestMethod.POST, value = "getcalculbag")
	    public CreateOrder createBillFromBag(@RequestBody Integer[] listIdAccountBag) {
	        return appService.createOrder(listIdAccountBag);
	    }
	    
}
