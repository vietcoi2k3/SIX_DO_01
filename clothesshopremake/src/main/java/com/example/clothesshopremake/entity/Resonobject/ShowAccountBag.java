package com.example.clothesshopremake.entity.Resonobject;

import com.example.clothesshopremake.entity.AccountBag;
import com.example.clothesshopremake.entity.CategoryType;
import com.example.clothesshopremake.entity.Product;

public class ShowAccountBag {
	 private AccountBag accountBag;
	    private Product product;
	    private CategoryType categoryType;

	    public AccountBag getAccountBag() {
	        return accountBag;
	    }

	    public void setAccountBag(AccountBag accountBag) {
	        this.accountBag = accountBag;
	    }

	    public Product getProduct() {
	        return product;
	    }

	    public void setProduct(Product product) {
	        this.product = product;
	    }

	    public CategoryType getCategoryType() {
	        return categoryType;
	    }

	    public void setCategoryType(CategoryType categoryType) {
	        this.categoryType = categoryType;
	    }
}
