package com.example.clothesshopremake.entity.Resonobject;

import com.example.clothesshopremake.entity.BillDetail;
import com.example.clothesshopremake.entity.Product;

public class ProductBillDetail {
	 private Product product;
	    private BillDetail billDetail;

	    public Product getProduct() {
	        return product;
	    }

	    public void setProduct(Product product) {
	        this.product = product;
	    }

	    public BillDetail getBillDetail() {
	        return billDetail;
	    }

	    public void setBillDetail(BillDetail billDetail) {
	        this.billDetail = billDetail;
	    }
}
