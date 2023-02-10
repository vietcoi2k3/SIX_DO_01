package com.example.clothesshopremake.Service;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clothesshopremake.Iservice.IAppService;
import com.example.clothesshopremake.entity.AccountBag;
import com.example.clothesshopremake.entity.AccountShipContact;
import com.example.clothesshopremake.entity.AccountStatus;
import com.example.clothesshopremake.entity.Accounts;
import com.example.clothesshopremake.entity.Bill;
import com.example.clothesshopremake.entity.BillDetail;
import com.example.clothesshopremake.entity.BillSales;
import com.example.clothesshopremake.entity.BuyMethod;
import com.example.clothesshopremake.entity.Product;
import com.example.clothesshopremake.entity.Role;
import com.example.clothesshopremake.entity.Sales;
import com.example.clothesshopremake.entity.ShipMethod;
import com.example.clothesshopremake.entity.Resonobject.AccountCustom;
import com.example.clothesshopremake.entity.Resonobject.CreateAccountData;
import com.example.clothesshopremake.entity.Resonobject.CreateOrder;
import com.example.clothesshopremake.entity.Resonobject.OrderItem;
import com.example.clothesshopremake.entity.Resonobject.OrderObject;
import com.example.clothesshopremake.entity.Resonobject.ProductBillDetail;
import com.example.clothesshopremake.entity.Resonobject.ProductDetail;
import com.example.clothesshopremake.entity.Resonobject.RemakeAccountRequest;
import com.example.clothesshopremake.entity.Resonobject.ShowAccountBag;
import com.example.clothesshopremake.repository.context.Dbcontext;



@Service
public class AppService implements IAppService{
	
	@Autowired
	Dbcontext dbContext;
	
	

	@Override
	public List<Product> nextPage(int id) {
		List<Product> tempProduct=dbContext.productRepo.findAll();
		if(tempProduct.size()-id*3<0)
		{
			return tempProduct.subList((id-1)*3, (id-1)*3+tempProduct.size()%3);
		}
		
		return tempProduct.subList((id-1)*3, (id-1)*3+3);
	}



	@Override
	public ProductDetail getProductById(int productId) {
		Product tempProduct =dbContext.productRepo.findById(productId).get();
		ProductDetail tempProductDetail =new ProductDetail();
		tempProductDetail.setBrand(tempProduct.getBrand());
		tempProductDetail.setSize(tempProduct.getSize());
		tempProductDetail.setCategoryType(tempProduct.getCategoryType());
		tempProductDetail.setProducer(tempProduct.getProducer());
		tempProductDetail.setProduct(tempProduct);
		tempProductDetail.setColor(tempProduct.getColor());
		return tempProductDetail;
	}



	@Override
	public CreateAccountData createAccountAndAccountShipContact(CreateAccountData accountData) {
		if(	!dbContext.accountRepo.checkUserName(accountData.getUserName()).isEmpty())
		{
			return null;
		}
		Accounts ac=new Accounts();
		ac.setAccountCode("TK"+(dbContext.accountRepo.findAll().size()+1));
		ac.setAccountCreateDate(LocalDate.now());
		ac.setAccountDetailAddress("customer");
		ac.setAccountPassword(accountData.getUserPass());
		AccountStatus accountStatus= dbContext.accountStatusRepo.findById(1).get();
		ac.setAccountStatus(accountStatus);
		ac.setAccountUserName(accountData.getUserName());
		ac.setName(accountData.getName());
		Role role =dbContext.roleRepo.findById(3).get();
		ac.setRole(role);
		ac.setSdt(accountData.getSdt());
		dbContext.accountRepo.save(ac);
		return accountData;
		
	}



	@Override
	public AccountCustom getAccountContacts(int accountId) {
		Accounts accounts=dbContext.accountRepo.findById(accountId).get();
		AccountCustom aCustom=new AccountCustom();
		aCustom.setAddress(accounts.getAccountDetailAddress());
		aCustom.setBorn(accounts.getAccountBorn());
		aCustom.setId(accounts.getAccountId());
		aCustom.setName(accounts.getName());
		aCustom.setRoleID(accounts.getRoleId());
		aCustom.setSdt(accounts.getSdt());
		aCustom.setShipContacts(accounts.getAccountShipContacts());
		return aCustom;
	}



	@Override
	public AccountCustom CheckLogin(String userName, String pass) {
		 Accounts account = dbContext.accountRepo.checkLogin(userName, pass);
	        if (account == null) {
	            return null;
	        }
	        AccountCustom result = new AccountCustom();
	        result.setRoleID(account.getRoleId());
	        result.setId(account.getAccountId());
	        result.setAddress(account.getAccountDetailAddress());
	        result.setName(account.getName());
	        result.setShipContacts(account.getAccountShipContacts());
	        return result;
		
	}



	@Override
	public RemakeAccountRequest remakeAccountInfo(RemakeAccountRequest data) {
		Accounts accounts = dbContext.accountRepo.findById(data.getAccountId()).get();
		accounts.setAccountBorn(data.getBorn());
		accounts.setName(data.getName());
		accounts.setAccountDetailAddress(data.getAddress());
		accounts.setSdt(data.getSdt());
		dbContext.accountRepo.save(accounts);
		return data;
	}



	@Override
	public AccountShipContact addNewAccountShipContact(AccountShipContact data) {
		dbContext.accountShipContactRepo.save(data);
		return data;
	}



	@Override
	public List<OrderObject> getOrderObjectByAccountId(int accountId) {
		 Optional<Accounts> account = dbContext.accountRepo.findById(accountId);
	        if (account.isEmpty()) {
	            return null;
	        }
	        if (account.get().getAccountShipContacts() == null) {
	            return null;
	        }
	        List<AccountShipContact> listShipContact = account.get().getAccountShipContacts();
	        List<OrderObject> listResult = new ArrayList<>();
	        for (AccountShipContact a : listShipContact) {
	            for (Bill bill : a.getBills()) {
	                OrderObject oo = new OrderObject();
	                oo.setAccountShipContact(a);
	                oo.setBill(bill);
	                oo.setBillStatus(bill.getBillStatus());
	                oo.setBuyMethod(bill.getBuyMethod());
	                for (BillSales bs : bill.getBillSalesList()) {
	                    if (bs.getSales().getSaleType().getSaleTypeId() == 1) {
	                        oo.setFreeShip(bs.getSales().getSalesInt() + bs.getSales().getSalesPercent());
	                    }
	                    if (bs.getSales().getSaleType().getSaleTypeId() == 2) {
	                        oo.setVoucherSIXDO(bs.getSales().getSalesInt() + bs.getSales().getSalesPercent());
	                    }
	                }
	                oo.setShipMethod(bill.getShipMethod());
	                List<ProductBillDetail> pd = new ArrayList<>();
	                for (BillDetail billDetail : bill.getBillDetails()) {
	                    ProductBillDetail pdb = new ProductBillDetail();
	                    pdb.setProduct(billDetail.getProduct());
	                    pdb.setBillDetail(billDetail);
	                    pd.add(pdb);
	                }
	                oo.setProductBillDetails(pd);
	                listResult.add(oo);
	            }
	        }
	        return listResult;
		
	}



	@Override
	public AccountBag addProduct2Bag(int accountId, int productId, int quantity) {
		 AccountBag accountBagCheck = dbContext.accountBagRepo.findByAccountIdAndProductId(accountId,productId);
	        if(accountBagCheck != null){
	            accountBagCheck.setQuantity(accountBagCheck.getQuantity()+quantity);
	            dbContext.accountBagRepo.save(accountBagCheck);
	            return accountBagCheck;
	        }

	        ///// sua doi
	        AccountBag accountBag = new AccountBag();
	        accountBag.setAccount(dbContext.accountRepo.findById(accountId).get());
	        accountBag.setProduct(dbContext.productRepo.findById(productId).get());
	        accountBag.setQuantity(quantity);
	        dbContext.accountBagRepo.save(accountBag);
	        return accountBag;
	}



	@Override
	public List<ShowAccountBag> getProductBagByAccountID(Integer accountId) {
		 List<ShowAccountBag> result = new ArrayList<>();
	        List<AccountBag> listAccountBag = dbContext.accountBagRepo.findByAccountId(accountId);
	        for (AccountBag ab : listAccountBag) {
	            ShowAccountBag showAccountBag = new ShowAccountBag();
	            showAccountBag.setAccountBag(ab);
	            showAccountBag.setProduct(dbContext.productRepo.findById(ab.getProductId()).get());
	            showAccountBag.setCategoryType(ab.getProduct().getCategoryType());
	            result.add(showAccountBag);
	        }
	        return result;
		
	}



	@Override
	public CreateOrder createOrder(Integer[] listIdAccountBag) {
		  CreateOrder co = new CreateOrder();
	        List<OrderItem> orderItems = new ArrayList<>();
	        List<Sales> salesOfBill = dbContext.salesRepo.getAllOfBillWithoutOff();
	        List<ShipMethod> shipMethods = dbContext.shipMethodRepo.findAll();
	        List<BuyMethod> buyMethods = dbContext.buyMethodRepo.findAll();
	        List<AccountShipContact> accountShipContacts = dbContext.accountBagRepo.findById(listIdAccountBag[0]).get().getAccount().getAccountShipContacts();
	        for (Integer i : listIdAccountBag) {
	            OrderItem oi = new OrderItem();
	            AccountBag ab = dbContext.accountBagRepo.findById(i).get();
	            oi.setAccountBagId(i);
	            oi.setProduct(ab.getProduct());
	            oi.setQuantity(ab.getQuantity());
	            oi.setCategoryType(ab.getProduct().getCategoryType());
	            orderItems.add(oi);
	        }
	        co.setAccountShipContacts(accountShipContacts);
	        co.setOrderItems(orderItems);
	        co.setSalesOfBill(salesOfBill);
	        co.setBuyMethods(buyMethods);
	        co.setShipMethods(shipMethods);
	        return co;
	}

	
	

}
